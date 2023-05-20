abstract class Animal implements AnimalAll {
    private String name;
    private int ves;
    private int hungry_lvl = 0;

    Animal(String name, int ves) throws MyException {
        this.name = name;
        if (ves != 0) {
            this.ves = ves;
        }else {
            throw new MyException("Вес должен быть больше нуля");
        }
    }
    public String getName() {
        return name;
    }

    public int getVes() {
        return ves;
    }

    @Override
    public void walk(Animal animal, int km, Location location) throws MyException {
        if(location == Location.Park) {
            System.out.println(this.name + " прогулял с " + animal.getName() + "ом в " + Location.Park.getTranslation() );
                if (km <= 10){
                    hungry_lvl += km * 10;
                    if(hungry_lvl > 30) {
                        eat(animal, 40);
                    }
                }else {
                    throw new MyException("Они так далеко не можеть идти.\n Установити значение km меньше десяти");
                }
        } else if(location == Location.Garden) {
            System.out.println(this.name + " прогулял с " + animal.getName() + "ом в " + Location.Garden.getTranslation() );
            System.out.println(this.name + " размышлял о том, скоро ли вырастет посаженный им  желудь" );
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
