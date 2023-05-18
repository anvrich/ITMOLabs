package Commands;
import Person.Person;

import java.util.HashMap;


public class FilterWeight {
    public static void filterLessThanWeight(HashMap<Integer, Person> personHashMap, long givenWeight) {
        boolean hasElements = false;

        for (Person person : personHashMap.values()) {
            if (person.getWeight() < givenWeight) {
                hasElements = true;
                System.out.println(person);
            }
        }
        if (!hasElements) {
            System.out.println("Нет элементов с весом меньше заданного значения.");
        }
    }
    public static void filterLessThanWeight(HashMap<Integer, Person> personHashMap, String[] command) {
        try {
            if (command.length == 2) {
                long givenWeight = Long.parseLong(command[1]);
                filterLessThanWeight(personHashMap, givenWeight);
            } else {
                System.out.println("Укажите вес в качестве аргумента команды.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат");
        }
    }
}
