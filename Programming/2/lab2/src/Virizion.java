import myattack.AerialAce;
import myattack.DoubleKick;
import myattack.Swagger;
import myattack.XScissor;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Virizion extends Pokemon {
    public Virizion(String name, int level){
        super(name,level);
        super.setType(Type.GRASS, Type.FIGHTING);
        super.setStats(91,90,72,90,129,108);

        var swagger = new Swagger(140,85);
        var xScissor = new XScissor(80,100);
        var doubleKick = new DoubleKick(30,100);
        var aerialAce = new AerialAce(60,100);
        super.setMove(swagger,xScissor, doubleKick, aerialAce);
    }

}
