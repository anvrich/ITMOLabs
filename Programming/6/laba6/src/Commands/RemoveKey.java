package Commands;

import static Commands.PersonCollection.personHashMap;

public class RemoveKey extends Command {
    public RemoveKey(){
        super("remove_key null", "Удалить элемент из коллекции по его ключу",true);

    }
    @Override
    public void execute() {
        try {
            Integer key = Integer.valueOf(getArgument());
            if (personHashMap.containsKey(key)) {
                personHashMap.remove(key);
                System.out.println("Элемент с ключом " + key + " успешно удален из коллекции.");
            }
            else {
                System.out.println("Элемент с ключом " + key + " не найден в коллекции.");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
