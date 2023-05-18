package Commands;

import Person.*;

import java.time.LocalDate;
import java.util.Scanner;

import static Commands.PersonCollection.personHashMap;

public class InsertCommand {
    static Scanner scan = new Scanner(System.in);
    public static void insert() {
        String name = Name("Введите имя: ");

        Float x1 = X1("Введите координаты x: ");
        Float y1 = Y1("Введите координаты y ");
        Coordinates coordinates = new Coordinates(x1, y1);

        LocalDate creationDate = LocalDate.now();
        Double height = Hight("Введите рост: ");
        Long weight = Weight("Введите вес: ");

        Color eyeColor = EyeColor("Введите цвет глаз: GREEN,BLACK,BLUE,ORANGE,WHITE: ");
        ColorH haircolor = HairColor("Введите цвет волос:   GREEN, BLACK,YELLOW :");

        Float x = LocationX("Введите локацию x: ");
        Double y = LocationY("Введит локацию y: ");
        Float z = LocationZ("Введите локацию z:");
        Location location = new Location(x, y, z);

        Person obj = new Person(name, coordinates, creationDate, height, weight, eyeColor, haircolor, location);
        personHashMap.put(obj.getId(), obj);

        System.out.println("Добавлено в коллекцию");
    }
    static String Name(String s){
        String input;
        do {
            System.out.print(s);
            input = scan.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Поле не может быть пустым. Пожалуйста, введите данные снова.");
            }
        }while (input.isEmpty());
        return input;
    }
     static Float X1(String s){
        while (true){
            try {
                System.out.print(s);
                float value = Float.parseFloat(scan.nextLine());
                return value;
            }catch (NumberFormatException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
     static Float Y1(String s){
        while (true){
            try{
                System.out.print(s + "<<поля должно быть больше -822>> :");
                float value = Float.parseFloat(scan.nextLine());
                if (value >-822){return value;}
                else System.out.println("Значение поля должно быть больше -822, попробуйте снова.");
            }catch (NumberFormatException e){
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
     static Double Hight(String s){
        while (true){
            try {
                System.out.print(s);
                double value = Double.parseDouble(scan.nextLine());
                if (value > 0) return value;
                else System.out.print("Значение поля должно быть больше 0!!! \n" );
            }catch (NumberFormatException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
     static Long Weight(String s){
        while (true){
            try {
                System.out.print(s);
                Long value = Long.parseLong(scan.nextLine());
                if (value > 0) return value;
                else System.out.println("Значение поля должно быть больше 0!!!");
            }catch (NumberFormatException e){
                System.out.println("Некорректное значение, попробуйте снова");
            }
        }
    }
     static Color EyeColor(String s){
        while (true){
            try {
                System.out.print(s);
                Color value = Color .valueOf(scan.nextLine().toUpperCase());
                return value;
            }catch (IllegalArgumentException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
     static ColorH HairColor(String s){
        while (true){
            try {
                System.out.print(s);
                ColorH value = ColorH.valueOf(scan.nextLine().toUpperCase());
                return value;
            }catch (IllegalArgumentException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
     static Float LocationX(String s){
        while (true){
            try {
                System.out.print(s);
                Float value = Float.parseFloat(scan.nextLine());
                return value;
            }catch (NumberFormatException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
     static Double LocationY(String s) {
        while (true) {
            try {
                System.out.print(s);
                String input = scan.nextLine().trim();
                if (input == "") throw new NullPointerException();
                double value = Double.parseDouble(input);
                return value;
            }catch (NullPointerException e) {
                return null;
            }
            catch (NumberFormatException e){
                System.out.println("Неправильный формат");
            }
        }
    }
     static Float LocationZ(String s){
        while (true) {
            try {
                System.out.print(s);
                String input = scan.nextLine().trim();
                if (input == "") throw new NullPointerException();
                Float value = Float.parseFloat(input);
                return value;
            }catch (NullPointerException e) {
                return null;
            }
            catch (NumberFormatException e){
                System.out.println("Неправильный формат");

            }
        }
    }

}