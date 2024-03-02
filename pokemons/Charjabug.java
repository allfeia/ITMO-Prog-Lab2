package pokemons;

import attacks.charjabug.Crunch;
import attacks.grubbin.ChargeBeam;
import attacks.grubbin.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Charjabug extends Grubbin {
    public Charjabug(String name, int level) {
        super(name, level);


        super.setType(Type.BUG, Type.ELECTRIC);
        super.setStats(57, 82, 95, 55, 75, 36);
    }
    Confide confide = new Confide(0,0);
    ChargeBeam chargeBeam = new ChargeBeam(50,90);
    Crunch crunch = new Crunch(80,100);
}

