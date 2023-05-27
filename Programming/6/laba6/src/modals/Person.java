package modals;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
    private static int nextId = 0;
    private Integer id;
    private String name;
    private Coordinates coordinates;
    private LocalDate creationDate;
    private Double height;
    private Long weight;
    private Color eyeColor;
    private ColorH hairColor;
    private Location location;
    public Person(String name, Coordinates coordinates, LocalDate creationDate, Double height, Long weight, Color eyeColor, ColorH hairColor, Location location) {
        this.id = ++nextId;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = LocalDate.now();
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.location = location;
    }



   public void update(String name,
                      Coordinates coordinates,
                      LocalDate creationDate,
                      Double height,
                      Long weight,
                      Color eyeColor,
                      ColorH hairColor,
                      Location location){
        this.name = name;
        this.coordinates = coordinates;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.location = location;
   }
   public void update(Person p){
        update( p.getName(),
                p.getCoordinates(),
                p.creationDate,
                p.getHeight(),
                p.getWeight(),
                p.getEyeColor(),
                p.getHairColor(),
                p.getLocation());
   }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Double getHeight() {
        return height;
    }

    public Long getWeight() {
        return weight;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public ColorH getHairColor() {
        return hairColor;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates.getX() + ","+ coordinates.getY()+
                ", creationDate=" + creationDate +
                ", height=" + height +
                ", weight=" + weight +
                ", eyeColor=" + eyeColor +
                ", hairColor=" + hairColor +
                ", location=" + location.getX() + ", " + location.getY() + ", " + location.getZ()+
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.id.compareTo(o.getId());
    }
}
