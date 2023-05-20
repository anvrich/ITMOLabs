package myattack;

import ru.ifmo.se.pokemon.*;

public class PoisonTail extends PhysicalMove {
    public PoisonTail(double pow, double acc){
        super(Type.POISON, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect().chance(0.1).stat(Stat.SPEED, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
      return "Принимает Poison Tail";
    }
}
