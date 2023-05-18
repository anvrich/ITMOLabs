package Commands;
import Person.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class PrintHairColor {
    public static void printFieldDescendingHairColor(HashMap<Integer, Person> personHashMap) {
        if (personHashMap.isEmpty()) {
            System.out.println("Коллекция пуста");
            return;
        }
        ArrayList<Person> personList = new ArrayList<>(personHashMap.values());
        personList.sort(Comparator.comparing(Person::getHairColor).reversed());

        System.out.println("Значения поля hairColor всех элементов в порядке убывания:");
        for (Person person : personList) {
            System.out.println(person.getHairColor());
        }
    }
}

