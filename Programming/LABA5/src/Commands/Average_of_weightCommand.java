package Commands;

import Person.Person;

import java.util.HashMap;

public class Average_of_weightCommand {
    public static double avarageOfWeight(HashMap<Integer, Person> personHashMap){
        if (personHashMap.isEmpty()){
            System.out.println("Коллекция пуста");
            return 0;
        }
        double sumOfWeights = 0;
        int personCount = personHashMap.size();
        for (Person person : personHashMap.values()) {
            sumOfWeights += person.getWeight();
        }
        double averageWeight = sumOfWeights / personCount;
        System.out.println("Средний вес всех элементов коллекции: " + averageWeight);
        return averageWeight;
    }
}
