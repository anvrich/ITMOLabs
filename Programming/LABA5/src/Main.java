import Commands.*;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static Commands.PersonCollection.personHashMap;
import static Commands.SaveComand.loadCSV;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1){
            System.out.println("Путь до файла csv нужно передать через аргумент командной строки!!!");
            System.exit(0);
        }
        String pathFile = args[0];
        String usercommand = "";
        String[] command;
        try {
            loadCSV(pathFile);
            if (personHashMap.isEmpty()){System.out.println("Коллекция пуста и поэтому загруженно 0 элемента");}
            else {System.out.println("Данные успешно загружены из файла file.csv");}
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            Scanner scan = new Scanner(System.in);
            while (true){
                System.out.print(">>");
                usercommand = scan.nextLine();
                command = usercommand.trim().split(" ");
                switch (command[0]){
                    case "" : break;
                    case "exit" :ExitComand.exit(); break;
                    case "help" : HelpCommand.help();break;
                    case "insert" : InsertCommand.insert();break;
                    case "show": ShowComand.show();break;
                    case "save" : SaveComand.save(pathFile);break;
                    case "update" : Update.update();break;
                    case "clear" : ClearComand.clear();break;
                    case "info" : InfoCommand.info(); break;
                    case "remove_key" : RemoveKeyCommand.remove_key();break;
                    case "remove_greater": RemoveGreater.removeElementsGreaterThan(personHashMap, command);break;
                    case "remove_lower_key": RemoveLowerKey.removeElementsWithLowerKey(personHashMap, command);break;
                    case "remove_greater_key":RemoveGreaterKey.removeElementsWithGreaterKey(personHashMap, command);break;
                    case "average_of_weight": Average_of_weightCommand.avarageOfWeight(personHashMap); break;
                    case "filter_less_than_weight" :
                        FilterWeight.filterLessThanWeight(personHashMap, command);break;
                    case "print_field_descending_hair_color": PrintHairColor.printFieldDescendingHairColor(personHashMap);break;
                    case "execute_script" : ExecuteScript.executeScriptCommand(command);break;
                    default: System.out.println("Неверная команда");
                }
            }
        }catch(NoSuchElementException e){
            System.out.println("Программа завершено");
        }
    }
}