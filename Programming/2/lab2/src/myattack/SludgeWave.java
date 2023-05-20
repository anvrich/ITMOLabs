package myattack;

import ru.ifmo.se.pokemon.*;

public class SludgeWave extends SpecialMove {
    public SludgeWave(double pow, double acc){
        super(Type.POISON, pow, acc);
    }
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect().condition(Status.SLEEP).chance(0.1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "Принимаеи Sludge Wave";
    }
}
