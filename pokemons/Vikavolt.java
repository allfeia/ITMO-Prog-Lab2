package pokemons;

import attacks.charjabug.Crunch;
import attacks.grubbin.ChargeBeam;
import attacks.grubbin.Confide;
import attacks.vikavolt.Spark;
import ru.ifmo.se.pokemon.Pokemon.*;
import ru.ifmo.se.pokemon.Type;


public class Vikavolt extends Charjabug {
    public Vikavolt(String name, int level) {
        super(name, level);


        super.setType(Type.BUG, Type.ELECTRIC);
        super.setStats(77, 70, 90, 145, 75, 43);
    }
    Confide confide = new Confide(0,0);
    ChargeBeam chargeBeam = new ChargeBeam(50,90);
    Crunch crunch = new Crunch(80,100);
    Spark spark = new Spark(65,100);
}
