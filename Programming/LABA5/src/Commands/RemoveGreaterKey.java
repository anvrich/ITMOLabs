package Commands;
import Person.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class RemoveGreaterKey {
    public static void removeElementsWithGreaterKey(HashMap<Integer, Person> personHashMap, String[] command) {
        try {
            if (command.length == 2) {
                int givenKey = Integer.parseInt(command[1]);
                removeGK(personHashMap, givenKey);
            } else {
                System.out.println("Укажите ключ в качестве аргумента команды.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат !!!");
        }
    }

    private static void removeGK(HashMap<Integer, Person> personHashMap, int givenKey) {
        Iterator<Map.Entry<Integer, Person>> iterator = personHashMap.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Person> entry = iterator.next();
            if (entry.getKey() > givenKey) {
                iterator.remove();
                count++;
            }
        }
        System.out.println("Удалено элементов: " + count);
    }

}
