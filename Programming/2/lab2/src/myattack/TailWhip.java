package myattack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class TailWhip extends StatusMove {
    public TailWhip(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK,2);
        super.applySelfEffects(pokemon);
    }
    @Override
    protected String describe(){
        return "Принимает Tail Whip";
    }
}
