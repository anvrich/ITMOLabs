public class Mouse extends Animal{
    Mouse(String name, int ves) throws MyException {
        super(name, ves);
    }

    public void say(String text){
        System.out.println(super.getName() + " сказал: " + text);
    }
}
