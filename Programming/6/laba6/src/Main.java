import Commands.Command;
import Commands.CommandManager;
import Commands.LoadCSV;
import Commands.PersonCollection;
import modals.Person;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static Commands.PersonCollection.personHashMap;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Путь до файла csv нужно передать через аргумент командной строки!!!");
            System.exit(0);
        }
        String  pathFile = null;
        if (args.length > 0){
            pathFile = args[0];
        }

        try {
            LoadCSV.load(pathFile);
            if (personHashMap.isEmpty()){System.out.println("Коллекция пуста и поэтому загруженно 0 элемента");}
            else System.out.println("Данные успешно загружены из файла file.csv: " +"Загружено объектов: " + PersonCollection.personHashMap.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(Scanner scan = new Scanner(System.in)) {
            String usercommand = "";
            String[]  finalcom;
            while (true){
                System.out.print(">>");
                usercommand = scan.nextLine();
                if (usercommand.trim().isEmpty()) continue;
                finalcom = usercommand.trim().split(" ");
                if (CommandManager.getComands().containsKey(finalcom[0])){
                    Command cmd = CommandManager.getComands().get(finalcom[0]);
                    if (cmd.isWithArgument()){
                        try {
                            if(finalcom[0].equals("save")) cmd.setArgument(pathFile);
                            else if (finalcom.length>1) {
                                cmd.setArgument(finalcom[1]);
                            }
                            else throw new NullPointerException();
                        }catch (NullPointerException e){
                            System.out.println("У команды должен быть аргумент! Подробно можно узнать по команде help.");
                        }
                    }
                    cmd.execute();
                }else System.out.println("Команда не найдена.Напишите help чтобы узнать подробнее");
            }
        }catch(NoSuchElementException e) {
            System.out.println("Программа завершена");
        }
    }
}
