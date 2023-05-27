package Commands;

public class Exit extends Command {
    public Exit(){
        super("exit","Завершить программу (без сохранения в файл)",false);
}
    @Override
    public void execute() {
        System.out.println("Программа завершено без сохранение в файл");
        System.exit(0);
    }
}

