import myattack.PoisonTail;
import myattack.SludgeBomb;
import myattack.SludgeWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Skrelp extends Pokemon {
    public Skrelp(String name, int level){
        super(name,level);

        super.setType(Type.POISON, Type.WATER);
        super.setStats(50,60,60,60,60,30);

        var sludgeWave = new SludgeWave(95,100);
        var poisonTail = new PoisonTail(50,100);
        var sludgeBomb = new SludgeBomb(90,100);
        super.setMove(sludgeWave, poisonTail, sludgeBomb);
    }
}
