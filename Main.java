import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pachirisu pachirisu = new Pachirisu("Rushana", 1);
        Meditite meditite = new Meditite("Ludmila", 2);
        Medicham medicham = new Medicham("Sneshana",3);
        Grubbin grubbin = new Grubbin("Gradimir",1);
        Charjabug charjabug = new Charjabug("Istislav",2);
        Vikavolt vikavolt = new Vikavolt("Bashen",3);

        b.addFoe(pachirisu);
        b.addAlly(grubbin);
        b.addFoe(meditite);
        b.addAlly(charjabug);
        b.addFoe(medicham);
        b.addAlly(vikavolt);

        b.go();
    }
}
