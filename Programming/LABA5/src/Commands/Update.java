package Commands;

import Person.*;

import java.util.Map;
import java.util.Scanner;

import static Commands.InsertCommand.*;

public class Update {
    public static void update(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите id объекта, который нужно обновить: ");
        int id = scan.nextInt();
        boolean found = false;
        for (Map.Entry<Integer, Person> inf : PersonCollection.personHashMap.entrySet()){
            if (inf.getKey().equals(id)) {
                found = true;
                String name = Name("Введите новые значения для элемента " + "'" + inf.getValue().getName() + "'" + ":  ");
                inf.getValue().setName(name);

                Float x1 = X1("<<Текущий значение: " + inf.getValue().getCoordinates().getX() + ">> ---> " + "Введите новые координаты x: ");
                Float y1 = Y1("<<Текущий значение: " + inf.getValue().getCoordinates().getY() + ">> --->" + "Введите новые координаты y: ");
                inf.getValue().setCoordinates(new Coordinates(x1, y1));

                Double height = Hight("<<Текущий рост: " + inf.getValue().getHeight() + ">> --->" + "Введите новый рост: ");
                inf.getValue().setHeight(height);
                Long weight = Weight("<<Текущий вес: " + inf.getValue().getWeight() + ">> --->" + "Введите новый вес: ");
                inf.getValue().setWeight(weight);

                Color eyeColor = EyeColor("<<Текущий цвет глаза: " + inf.getValue().getEyeColor() + ">> --->" + "Введите новый цвет глаз: GREEN,BLACK,BLUE,ORANGE,WHITE: ");
                inf.getValue().setEyeColor(eyeColor);
                ColorH hairColor = HairColor("<<Текущий цвет волос: " + inf.getValue().getHairColor() + ">> --->" + "Введите новый цвет волос:   GREEN, BLACK,YELLOW :");
                inf.getValue().setHairColor(hairColor);

                Float x = LocationX("<<Текущий значение x:" + inf.getValue().getLocation().getX() + ">> --->" + "Введите новую локацию x: ");
                Double y = LocationY("<<Текущий значение x:" + inf.getValue().getLocation().getY() + ">> --->" + "Введит новую локацию y: ");
                Float z = LocationZ("<<Текущий значение x:" + inf.getValue().getLocation().getZ() + ">> --->" + "Введите новуюы локацию z:");
                Location location = new Location(x, y, z);
                inf.getValue().setLocation(location);
                System.out.println("Элемент с ID " + id + " успешно обновлен.");break;
            }
        }if (!found) {
            System.out.println("Элемент с ID " + id + " не найден в коллекции");
        }
    }
}