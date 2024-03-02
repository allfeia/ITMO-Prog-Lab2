package attacks.charjabug;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove {
    public Crunch(double pow, double acc) {
        super(Type.DARK, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() < 0.2) {
            Effect effect = new Effect().stat(Stat.DEFENSE, -1);
        }
    }

    @Override
    protected String describe () {
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
        }
    }
