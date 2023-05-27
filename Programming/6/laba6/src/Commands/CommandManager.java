package Commands;

import java.util.HashMap;

public class CommandManager {
    private static HashMap<String, Command> commands;
    static {
        commands = new HashMap<>();
        commands.put("help", new Help());
        commands.put("info", new Info());
        commands.put("show", new Show() );
        commands.put("insert", new Insert());
        commands.put("update", new Update());
        commands.put("remove_key",new RemoveKey());
        commands.put("clear", new Clear());
        commands.put("save", new Save());
        commands.put("execute_script", new ExecuteScript());
        commands.put("exit", new Exit());
        commands.put("remove_greater",new RemovGreater());
        commands.put("remove_greater_key", new RemoveGreaterKey());
        commands.put("remove_lower_key",new RemoveLowerKey());
        commands.put("average_of_weight",new AverageOfWeight());
        commands.put("filter_less_than_weight",new FilterLessThanWeight());
        commands.put("print_field_descending_hair_color", new PrintFieldDescendingHairColor());
    }
    public static HashMap<String, Command> getComands() {
        return commands;
    }
}
