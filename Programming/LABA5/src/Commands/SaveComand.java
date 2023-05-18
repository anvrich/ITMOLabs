package Commands;

import Person.*;

import java.io.*;
import java.time.LocalDate;
import java.util.Map;


public class SaveComand {
    public static void save(String pathFile) throws IOException {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(pathFile, false));
             BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(bos))) {

            for (Map.Entry<Integer, Person> inf : PersonCollection.personHashMap.entrySet()) {
                Integer id = inf.getKey();
                Person person = inf.getValue();
                String name = person.getName();
                Coordinates coordinates = person.getCoordinates();
                LocalDate creationDate = person.getCreationDate();
                Double height = person.getHeight();
                Long weight = person.getWeight();
                Color eyeColor = person.getEyeColor();
                ColorH hair = person.getHairColor();
                Location location = person.getLocation();
                String line = id + "," + name + "," + coordinates.getX() + "," + coordinates.getY() + "," + creationDate + "," + height + "," + weight + "," + eyeColor + "," + hair + "," + location.getX() + "," + location.getY() + "," + location.getZ();

                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            if (PersonCollection.personHashMap.isEmpty()) {
                System.out.println("Коллекция пуста и поэтому сохранилось 0 элементов");
            } else {
                System.out.println("Данные успешно записаны в файл file.csv");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    public static void loadCSV(String pathFile) throws IOException {
        try (BufferedInputStream bIs = new BufferedInputStream(new FileInputStream(pathFile));
             BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(bIs))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");

                Integer id = Integer.parseInt(parts[0]);

                String name = parts[1];

                Float coordinatesX = Float.valueOf(parts[2]);
                Float coordinatesY = Float.valueOf(parts[3]);
                Coordinates coordinates = new Coordinates(coordinatesX, coordinatesY);

                LocalDate localDate = LocalDate.parse(parts[4]);

                Double height = Double.parseDouble(parts[5]);

                Long weight = Long.parseLong(parts[6]);

                Color eyeColor = Color.valueOf(parts[7]);

                ColorH hairColor = ColorH.valueOf(parts[8]);

                Float x = Float.parseFloat(parts[9]);
                double y = Double.parseDouble(parts[10]);
                float z = Float.parseFloat(parts[11]);
                Location location = new Location(x, y, z);

                Person obj = new Person(name, coordinates, localDate, height, weight, eyeColor, hairColor, location);
                PersonCollection.personHashMap.put(id, obj);
            }
        }
    }
}