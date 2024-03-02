package pokemons;

import attacks.meditite.LowSweep;
import attacks.meditite.Recover;
import attacks.meditite.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Meditite extends Pokemon {
    public Meditite(String name, int level) {
        super(name, level);

        super.setType(Type.FIGHTING, Type.PSYCHIC);
        super.setStats(30,40,55,40,55,60);

        Recover recover = new Recover(0,0);
        Swagger swagger = new Swagger(0,85);
        LowSweep lowSweep = new LowSweep(65,100);
    }
}
