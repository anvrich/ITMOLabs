package Commands;

import java.util.HashMap;

public class Help extends Command {

    public Help() {
        super("help", "Вывести справку по доступным командам",false);
    }

    @Override
    public void execute() {
        int count = 1;
        HashMap<String,Command> info = CommandManager.getComands();
        for (String part : info.keySet()){
            String key = info.get(part).getName();
            String value = info.get(part).getDescription();
            System.out.println(count++ +")"+ key + ": \n-" + value +"\n");
        }
    }
}
