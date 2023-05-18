package Commands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ExecuteScript {
    private static Set<String> executedScripts = new HashSet<>();
    public static void execute(String fileName) {
        if (executedScripts.contains(fileName)) {
            System.out.println("Ошибка: обнаружено рекурсивное выполнение скрипта!");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            executedScripts.add(fileName);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] command = line.trim().split(" ");
                switch (command[0]) {
                    case "info":
                        InfoCommand.info();
                        break;
                    case "help" :
                        HelpCommand.help();
                        break;
                    case "show":
                        ShowComand.show();
                        break;
                    case "execute_script":
                        executeScriptCommand(command);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } finally {
            executedScripts.remove(fileName);
        }
    }

    public static void executeScriptCommand(String[] command) {
        if (command.length == 2) {
            String fileName = command[1];
            execute(fileName);
        } else {
            System.out.println("Укажите имя файла скрипта в качестве аргумента команды.");
        }
    }
}
