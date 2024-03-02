package attacks.meditite;

import ru.ifmo.se.pokemon.*;

public class Recover extends StatusMove {
    public Recover(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        int HPlevel = (int) (100 - pokemon.getHP());
        Effect effectHP = new Effect().stat(Stat.HP, +2);
    }
    @Override
    protected String describe() {
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }

}
