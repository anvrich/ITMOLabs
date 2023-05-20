import myattack.Discharge;
import myattack.Facade;
import myattack.TailWhip;
import myattack.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Raichu extends Pokemon {
    public Raichu(String name, int level){
        super(name,level);

        super.setType(Type.ELECTRIC);
        super.setStats(60,90,55,90,80,110);

        var facade = new Facade(70,100);
        var tailWhip = new TailWhip(0,100);
        var discharge = new Discharge(80,100);
        var thunderWave = new ThunderWave(100,70);

        super.setMove(facade, tailWhip, discharge, thunderWave);
    }
}
