package pokemons;

import attacks.medicham.ZenHeadbutt;
import attacks.meditite.LowSweep;
import attacks.meditite.Recover;
import attacks.meditite.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Medicham extends Meditite {
    public Medicham(String name, int level) {
        super(name, level);

        super.setType(Type.FIGHTING, Type.PSYCHIC);
        super.setStats(60, 60, 75, 60, 75, 80);
    }
    Recover recover = new Recover(0,0);
    Swagger swagger = new Swagger(0,85);
    LowSweep lowSweep = new LowSweep(65,100);
    ZenHeadbutt zenHeadbutt = new ZenHeadbutt(80,90);
}
