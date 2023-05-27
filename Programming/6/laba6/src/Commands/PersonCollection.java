package Commands;

import modals.Person;

import java.util.Date;
import java.util.HashMap;

public class PersonCollection {
    String pathFile;
    public static HashMap<Integer, Person> personHashMap = new HashMap<>();
    public PersonCollection(String pathFile){
        this.pathFile = pathFile;
    }
    public static Date date = new Date();
}
