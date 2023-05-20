import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        var p1 = new Dragalge("Pok1", 1);
        var p2 = new Virizion("Pok2", 1);
        var p3 = new Skrelp("Pok3", 1);

        var p4 = new Pikachu("Pok4",1);
        var p5 = new Pichu("Pok5", 1);
        var p6 = new Raichu("Pok6",1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}
