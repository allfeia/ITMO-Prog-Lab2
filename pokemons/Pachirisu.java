package pokemons;

import attacks.pachirisu.DefenseCurl;
import attacks.pachirisu.DoubleTeam;
import attacks.pachirisu.Growl;
import attacks.pachirisu.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pachirisu extends Pokemon {
    public Pachirisu(String name, int level){
        super(name,level);

        super.setType(Type.ELECTRIC);
        super.setStats(60,45,70,45,90,95);

        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        DefenseCurl defenseCurl = new DefenseCurl(0,0);
        Growl growl = new Growl(0,100);
        Rest rest = new Rest(0,0);
        super.setMove(doubleTeam, defenseCurl);

    }
}
