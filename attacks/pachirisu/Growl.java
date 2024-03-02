package attacks.pachirisu;

import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
        public Growl(double pow, double acc){
            super(Type.NORMAL,pow,acc);

        }

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            super.applyOppEffects(pokemon);
            Effect e = new Effect().stat(Stat.ATTACK, -1);
            pokemon.addEffect(e);
        }

        @Override
        protected String describe() {
            String[] AttackName = this.getClass().toString().split("\\.");
            return "does " + AttackName[AttackName.length - 1];
        }
    }
