package Commands;

public class ClearComand {
    public static void clear(){
        PersonCollection.personHashMap.clear();
        System.out.println("Коллекцие очистилось ");
    }
}
