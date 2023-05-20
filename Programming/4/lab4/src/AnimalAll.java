public interface AnimalAll extends Eat, Walk{
    void walk(Animal animal, int km, Location location) throws Exception;
    void eat(Animal animal, int kkl);
    void say_poem(String poem);
}
