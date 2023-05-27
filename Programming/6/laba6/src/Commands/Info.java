package Commands;

public class Info extends Command{

    public Info() {
        super("info", "Вывести в стандартный поток вывода информацию о коллекции",false);
    }

    @Override
    public void execute() {
        System.out.println("Тип коллекции: HashMap");
        System.out.println("Дата инициализации:" + PersonCollection.date);
        System.out.println("Количество элементов :" + PersonCollection.personHashMap.size());
    }
}
