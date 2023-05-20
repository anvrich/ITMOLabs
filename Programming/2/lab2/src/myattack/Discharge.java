package myattack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Discharge extends SpecialMove {
    public Discharge(double pow, double acc){
        super(Type.ELECTRIC,pow, acc);

    }
    @Override
    public void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK,+2);
    }

    @Override
    protected String describe(){
    return "Приминяет Discharge";
    }

}
