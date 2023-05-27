package Commands;

import modals.Person;

import static Commands.PersonCollection.personHashMap;

public class FilterLessThanWeight extends Command {
    public FilterLessThanWeight(){
        super("filter_less_than_weight weight","Вывести элементы, значение поля weight которых меньше заданного",true);
    }
    @Override
    public void execute() {
        try {
            Long weight = Long.valueOf(getArgument());
            boolean hasElements = false;
            for (Person person : personHashMap.values()) {
                if (person.getWeight() < weight) {
                    hasElements = true;
                    System.out.println(person);
                }
            }
            if (!hasElements) {
                System.out.println("Нет элементов с весом меньше заданного значения.");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
