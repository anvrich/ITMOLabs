package Commands;

import java.util.HashMap;

public abstract class Command implements Describable, Executable {
  private String name;
  private String description;
  private String argument = null;
  private boolean withArgument = false;
    public Command(String name, String description, boolean withArgument) {
        this.name = name;
        this.description = description;
        this.withArgument = withArgument;
    }
    public boolean isWithArgument(){
        return withArgument;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    public void setArgument(String argument){
        this.argument = argument;
    }
    public String getArgument() {
        return argument;
    }

    @Override
    public String toString() {
        return "Command{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", argument='" + argument + '\'' +
                ", withArgument=" + withArgument +
                '}';
    }
}
