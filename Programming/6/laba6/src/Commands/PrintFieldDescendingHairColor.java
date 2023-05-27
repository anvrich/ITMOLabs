package Commands;

import modals.Person;

import java.util.ArrayList;
import java.util.Comparator;

import static Commands.PersonCollection.personHashMap;

public class PrintFieldDescendingHairColor extends Command {
    public PrintFieldDescendingHairColor(){
        super("print_field_descending_hair_color", "Вывести значения поля hairColor всех элементов в порядке убывания",false);
    }
    @Override
    public void execute() {
        if (personHashMap.isEmpty()) {
            System.out.println("Коллекция пуста");
        }
        ArrayList<Person> personList = new ArrayList<>(personHashMap.values());
        personList.sort(Comparator.comparing(Person::getHairColor).reversed());

        System.out.println("Значения поля hairColor всех элементов в порядке убывания:");
        for (Person person : personList) {
            System.out.println(person.getHairColor());
        }
    }
}
