package Commands;


import modals.Person;

import java.util.Map;

public class Show extends Command {
    public Show(){
        super("show", "Вывести в стандартный поток вывода все элементы коллекции в строковом представлении",false);

    }
    @Override
    public void execute() {
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
