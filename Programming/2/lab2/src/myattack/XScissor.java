package myattack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class XScissor extends PhysicalMove {
    public XScissor(double pow,double acc){
        super(Type.BUG, pow, acc);

    }
    @Override
    public void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK,+2);
    }

    @Override
    protected String describe(){
      return "Принимает X-Scrissor";
    }

}
