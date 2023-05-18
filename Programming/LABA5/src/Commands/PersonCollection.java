package Commands;

import Person.Person;

import java.util.Date;
import java.util.HashMap;


public class PersonCollection {
    String pathFile;
    public static HashMap<Integer, Person> personHashMap = new HashMap<>();
    public PersonCollection(String pathFile){
        this.pathFile = pathFile;
    }
    public static Date date = new Date();
    static HashMap<String,String> manual;
    static {
        manual = new HashMap<>();
        manual.put("help", "Вывести справку по доступным командам");
        manual.put("info", "Вывести в стандартный поток вывода информацию о коллекции");
        manual.put("show", "Вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        manual.put("insert null {element}", "Добавить новый элемент с заданным ключом");
        manual.put("update id {element}", "Обновить значение элемента коллекции, id которого равен заданному");
        manual.put("remove_key null", "Удалить элемент из коллекции по его ключу");
        manual.put("clear", "Очистить коллекцию");
        manual.put("save", "Сохранить коллекцию в файл");
        manual.put("execute_script file_name", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
        manual.put("exit", "Завершить программу (без сохранения в файл)");
        manual.put("remove_greater {element}", "Удалить из коллекции все элементы, превышающие заданный");
        manual.put("remove_greater_key null", "Удалить из коллекции все элементы, ключ которых превышает заданный");
        manual.put("remove_lower_key null"," Удалить из коллекции все элементы, ключ которых меньше, чем заданный");
        manual.put("average_of_weight","Вывести среднее значение поля weight для всех элементов коллекции");
        manual.put("filter_less_than_weight weight","Вывести элементы, значение поля weight которых меньше заданного");
        manual.put("print_field_descending_hair_color","Вывести значения поля hairColor всех элементов в порядке убывания");
    }
}
