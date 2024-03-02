package attacks.pachirisu;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam(double pow, double acc){
        super(Type.NORMAL,pow,acc);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        Effect e = new Effect().stat(Stat.EVASION, 1);
        pokemon.addEffect(e);
    }
    @Override
    protected String describe() {
        String[] AttackName = this.getClass().toString().split("\\.");
        return "does " + AttackName[AttackName.length - 1];
    }
}
