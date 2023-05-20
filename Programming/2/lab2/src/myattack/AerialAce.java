package myattack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
    public AerialAce(double pow, double acc){
        super(Type.FLYING, pow, acc);
    }
    @Override
    public void applySelfEffects (Pokemon p){
        p.setMod(Stat.SPEED,-1);
    }
    @Override
    protected String describe(){
    return "Приминяет Aerial Ace";
    }
}
