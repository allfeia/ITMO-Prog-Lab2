package attacks.vikavolt;

import ru.ifmo.se.pokemon.*;

public class Spark extends PhysicalMove {
    public Spark(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() < 0.3) {
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe () {
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}

