package myattack;
import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);
        Effect effect = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.addEffect(effect);
    }
    @Override
    protected String describe(){
    return "Принимает Thunder Wave";
    }
}
