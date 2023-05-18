package Commands;
import java.util.Scanner;

import static Commands.PersonCollection.personHashMap;
public class RemoveKeyCommand {
    public static void remove_key() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ключ (id) элемента для удаления: ");
        try {
        int key = Integer.parseInt(scan.nextLine());
        if (personHashMap.containsKey(key)) {
            personHashMap.remove(key);
            System.out.println("Элемент с ключом " + key + " успешно удален из коллекции.");
        } else {
            System.out.println("Элемент с ключом " + key + " не найден в коллекции.");
        }
        }catch (NumberFormatException e){
            System.out.println("Неверный формат!!!");
        }
    }
}
