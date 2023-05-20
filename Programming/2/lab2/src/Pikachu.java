import myattack.Discharge;
import myattack.Facade;
import myattack.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level){
        super(name,level);

        super.setType(Type.ELECTRIC);
        super.setStats(35,55,40,50,50,90);

        var facade = new Facade(70,100);
        var tailWhip = new TailWhip(0,100);
        var discharge = new Discharge(80,100);

        super.setMove(facade, tailWhip, discharge);
    }
}
