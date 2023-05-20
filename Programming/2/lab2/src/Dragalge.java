import myattack.PoisonTail;
import myattack.SludgeBomb;
import myattack.SludgeWave;
import myattack.Twister;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dragalge extends Pokemon {
    public Dragalge(String name, int level) {
        super(name, level);

        super.setType(Type.POISON, Type.DRAGON);
        super.setStats(65, 75, 90, 97, 123, 44);

        var sludgeWave = new SludgeWave(95, 100);
        var poisonTail = new PoisonTail(50, 100);
        var sludgeBomb = new SludgeBomb(90, 100);
        var twister = new Twister(40, 100);

        super.setMove(sludgeWave, poisonTail, sludgeBomb, twister);
    }
}
