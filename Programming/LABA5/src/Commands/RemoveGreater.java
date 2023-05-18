package Commands;
import Person.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveGreater {
    public static void removeElementsGreaterThan(HashMap<Integer, Person> personHashMap, String[] command) {
        if (command.length == 2) {
            try {
                if (PersonCollection.personHashMap.isEmpty()){
                    System.out.println("Колекция пуста.");
                    return;
                }
                int givenId = Integer.parseInt(command[1]);
                Person givenPerson = personHashMap.get(givenId);

                if (givenPerson != null) {
                    removeGreater(personHashMap, givenPerson);
                } else {
                    System.out.println("Элемент с указанным ID не найден.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ID. ID должен быть целым числом.");
            }
        } else {
            System.out.println("Укажите ID элемента в качестве аргумента команды.");
        }
    }

    private static void removeGreater(HashMap<Integer, Person> personHashMap, Person givenPerson) {
        Iterator<Map.Entry<Integer, Person>> iterator = personHashMap.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Person> entry = iterator.next();
            if (entry.getValue().compareTo(givenPerson) > 0) {
                iterator.remove();
                count++;
            }
        }
        System.out.println("Удалено элементов: " + count);
    }
}
