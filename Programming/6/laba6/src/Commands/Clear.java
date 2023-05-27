package Commands;

public class Clear extends Command {
    public Clear(){
        super("clear","Очистить коллекцию",false);
}
    @Override
    public void execute() {
        PersonCollection.personHashMap.clear();
        System.out.println("Коллекцие очистилось");
    }
}
