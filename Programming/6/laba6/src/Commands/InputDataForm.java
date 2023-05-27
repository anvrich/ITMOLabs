package Commands;

import modals.*;

import java.time.LocalDate;
import java.util.Scanner;

public class InputDataForm {

    static Scanner scan = new Scanner(System.in);

    public static Person input() {
        Person person = new Person(
                Name(),
                new Coordinates(X1(), Y1()),
                LocalDate.now(),
                Hight(),
                Weight(),
                EyeColor(),
                HairColor(),
                new Location( LocationX(), LocationY(), LocationZ())
                );
        return person;
    }



    static String Name(){
        String input;
        do {
            System.out.print("Введите имя: ");
            input = scan.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Поле не может быть пустым. Пожалуйста, введите данные снова.");
            }
        }while (input.isEmpty());
        return input;
    }
    static Float X1(){
        while (true){
            try {
                System.out.print("Введите координаты x: ");
                float value = Float.parseFloat(scan.nextLine());
                return value;
            }catch (NumberFormatException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
    static Float Y1(){
        while (true){
            try{
                System.out.print("Введите координаты y : " + "<<поля должно быть больше -822>> :");
                float value = Float.parseFloat(scan.nextLine());
                if (value >-822){return value;}
                else System.out.println("Значение поля должно быть больше -822, попробуйте снова.");
            }catch (NumberFormatException e){
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
    static Double Hight(){
        while (true){
            try {
                System.out.print("Введите рост: ");
                double value = Double.parseDouble(scan.nextLine());
                if (value > 0) return value;
                else System.out.print("Значение поля должно быть больше 0!!! \n" );
            }catch (NumberFormatException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
    static Long Weight(){
        while (true){
            try {
                System.out.print("Введите вес: ");
                Long value = Long.parseLong(scan.nextLine());
                if (value > 0) return value;
                else System.out.println("Значение поля должно быть больше 0!!!");
            }catch (NumberFormatException e){
                System.out.println("Некорректное значение, попробуйте снова");
            }
        }
    }
    static Color EyeColor(){
        while (true){
            try {
                System.out.print("Введите цвет глаз: GREEN,BLACK,BLUE,ORANGE,WHITE: ");
                Color value = Color .valueOf(scan.nextLine().toUpperCase());
                return value;
            }catch (IllegalArgumentException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
    static ColorH HairColor(){
        while (true){
            try {
                System.out.print("Введите цвет волос:   GREEN, BLACK,YELLOW :");
                ColorH value = ColorH.valueOf(scan.nextLine().toUpperCase());
                return value;
            }catch (IllegalArgumentException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
    static Float LocationX(){
        while (true){
            try {
                System.out.print("Введите локацию x: ");
                Float value = Float.parseFloat(scan.nextLine());
                return value;
            }catch (NumberFormatException e) {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }
    }
    static Double LocationY() {
        while (true) {
            try {
                System.out.print("Введит локацию y: ");
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
    static Float LocationZ(){
        while (true) {
            try {
                System.out.print("Введите локацию z:");
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
