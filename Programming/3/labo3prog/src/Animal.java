import java.io.IOException;

abstract class Animal implements AnimalAll {
    private String name;
    private int hungry_lvl = 0;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void walk(Animal animal, int km, Location location) throws Exception {

        if(location == Location.Park) {
            if (location == null){
                try {
                    System.out.println(this.name + " прогулял с " + animal.getName() + "ом в " + Location.Park.getTranslation() );
                    hungry_lvl += km * 10;
                }catch (Exception exception){
                    System.out.println("Они вместе сидели дома");
                }
            }
            System.out.println(this.name + " прогулял с " + animal.getName() + "ом в " + Location.Park.getTranslation() );
            hungry_lvl += km * 10;
            if(hungry_lvl > 30) {
                eat(animal, 40);
            }
        } else if(location == Location.Garden) {
            System.out.println(this.name + " размышлял о том, скоро ли вырастет посаженный им " + Tree.Zhelud.getTranslation());
        }
    }
    @Override
    public void eat(Animal animal, int kkl) {
        System.out.println(this.name + " обедает с " + animal.getName()+"ом" +"\n");
        say_poem("Неважно, чем он занят, \n так как он толстеть не станет, \n а ведь он толстеть не станет \n ");
        hungry_lvl -= kkl;
    }
    @Override
    public void say_poem(String poem){
        System.out.println(this.name + " рассказал стих:\n " + poem);
    }

}
