package myattack;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    public void applySelfDamage(Pokemon pokemon,double d){
        super.applySelfDamage(pokemon, 2);
        Effect effect = new Effect().stat(Stat.ATTACK, 2);
        Effect.sleep(pokemon);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
    return "Применяет Facade";
    }

}
