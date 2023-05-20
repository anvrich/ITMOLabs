import myattack.Facade;
import myattack.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {
    public Pichu(String name, int level){
        super(name, level);

        super.setType(Type.ELECTRIC);
        super.setStats(20,40,15,35,35,60);

        var facade = new Facade(70,100);
        var tailWhip = new TailWhip(0,100);
        super.setMove(facade,tailWhip);
    }
}
