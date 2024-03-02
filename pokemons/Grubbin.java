package pokemons;

import attacks.grubbin.ChargeBeam;
import attacks.grubbin.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grubbin extends Pokemon {
    public Grubbin(String name, int level) {
        super(name, level);

        super.setType(Type.BUG);
        super.setStats(60, 60, 75, 60, 75, 80);
    }
    Confide confide = new Confide(0,0);
    ChargeBeam chargeBeam = new ChargeBeam(50,90);
}
