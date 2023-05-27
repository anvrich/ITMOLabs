package Commands;

import modals.Person;

import java.util.Map;

public class Update extends Command {
    public Update(){
        super("update id {element}","Обновить значение элемента коллекции, id которого равен заданному",true);

    }
    @Override
    public void execute() {
        try {
            Integer id = Integer.valueOf(getArgument());
            for (Map.Entry<Integer, Person> inf : PersonCollection.personHashMap.entrySet()) {
                if (inf.getKey().equals(id)) {
                    Person person = InputDataForm.input();
                    inf.getValue().update(person);
                    System.out.println("Информация пользователя с ID " + id + " успешно обновлены");
                }
            }
            if (id < 0) {
                System.out.println("Неверный формат аргумента!!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
