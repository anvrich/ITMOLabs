package Commands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ExecuteScript extends Command {
    public ExecuteScript(){
        super("execute_script file_name", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.",true);
    }
    private static Set<String> executedScripts = new HashSet<>();
    @Override
    public void execute() {
        if (executedScripts.contains(getArgument())) {
            System.out.println("Ошибка: обнаружено рекурсивное выполнение скрипта!");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(getArgument()))) {
            executedScripts.add(getArgument());
            String line;
            while ((line = reader.readLine()) != null) {
                String[] input = line.trim().split(" ");
                if (CommandManager.getComands().containsKey(input[0])){
                    Command cmd = CommandManager.getComands().get(input[0]);
                    if (cmd.isWithArgument() && input.length > 1){
                        cmd.setArgument(input[1]);
                    }
                    cmd.execute();
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } finally {
            executedScripts.remove(getArgument());
        }
    }
}
