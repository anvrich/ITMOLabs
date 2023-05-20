
public class Main {
    public static void main(String[] args) throws MyException {
        Bear vini = new Bear("Вини-Пух", 10);
        Pig ptchok = new Pig("Пятачок", 8);
        Tiger tiger = new Tiger("Ягуляр", 21);
        Mouse mouse = new Mouse("Ру", 5);


        tiger.climing(mouse);
        try {
            vini.walk(ptchok, 5, Location.Park);
        }catch (Exception e){
            System.out.println("Они слышком устали Укажите значение km меньше десяти");
        }
        ptchok.walk(vini, 2, Location.Garden);
    }
}
