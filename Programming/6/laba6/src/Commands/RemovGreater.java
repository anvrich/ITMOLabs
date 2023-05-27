package Commands;

public class RemovGreater extends Command {
    public RemovGreater(){
        super("remove_greater {element}", "Удалить из коллекции все элементы, превышающие заданный",true);
    }

    @Override
    public void execute() {

    }
}
