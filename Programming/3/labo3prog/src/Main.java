
public class Main {
    public static void main(String[] args) throws Exception {
        Bear vini = new Bear("Вини-Пух");
        Pig ptchok = new Pig("Пятачок");

        vini.walk(ptchok, 4, Location.Park);
        ptchok.walk(vini, 1, Location.Garden);
//        Anvar anvar = new Anvar("Anvar");
//        Shahzod shahzod = new Shahzod("Шахзод");
//        America america = new America();
//        america.goA(anvar,shahzod);
//        anvar.walk(shahzod);
//
    }
}
//Так они и сделали. Тем временем Винни-Пух и Пятачок продолжали свою прогулку.
// Пух в стихах сообщал Пятачку, что "неважно, чем он занят, так как он толстеть не станет,
// а ведь он толстеть не станет";
// а Пятачок размышлял о том, скоро ли вырастет посаженный им желудь.