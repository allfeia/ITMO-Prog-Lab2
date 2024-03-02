package attacks.grubbin;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(effect);
    }
    @Override
    protected String describe() {
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}
