package Commands;

import modals.Person;

public class Insert extends Command {

    public Insert(){
        super("insert null {element}", "Добавить новый элемент с заданным ключом",false);
    }
    @Override
    public void execute() {
        Person person = InputDataForm.input();
        PersonCollection.personHashMap.put(person.getId(), person);
        System.out.println("Добавлена в коллекцию.");

    }
}
