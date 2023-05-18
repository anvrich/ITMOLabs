package Commands;

import Person.Person;

import java.util.Map;

public class ShowComand {
    public static void show(){
        if (PersonCollection.personHashMap.isEmpty()){
            System.out.println("Колекция пуста");
        }
        else {
            for (Map.Entry<Integer, Person> inf : PersonCollection.personHashMap.entrySet()){
                System.out.println(inf.getValue());
            }
        }
    }
}
