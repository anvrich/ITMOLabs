package Commands;

public class InfoCommand {
    public static void info(){
        System.out.println("Тип коллекции: HashMap");
        System.out.println("Дата инициализации:" + PersonCollection.date);
        System.out.println("Количество элементов :" + PersonCollection.personHashMap.size());
    }
}
