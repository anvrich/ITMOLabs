package myattack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Twister extends SpecialMove {
    public Twister(double pow, double acc){
        super(Type.DRAGON, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def,damage);
    }

    @Override
    protected String describe(){
      return "Принимает Twister";
    }
}
