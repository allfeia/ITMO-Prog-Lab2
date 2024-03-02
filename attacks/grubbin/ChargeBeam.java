package attacks.grubbin;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        if (Math.random() < 0.7) {
            Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        }
    }

    @Override
    protected String describe() {
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
        }

    }
