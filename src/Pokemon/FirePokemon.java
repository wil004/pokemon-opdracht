package Pokemon;

import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final String type;
    private final List<String> weakness;
    private final List<String> strength;

    public FirePokemon(String name, int level) {
        super(name, level);
        weakness = new ArrayList<>();
        strength = new ArrayList<>();
        type = "fire";
        weakness.add("water");
        weakness.add("rock");
        strength.add("grass");
        strength.add("fire");
    }




    @Override
    public void setType(String type) {
    }

    @Override
    public String getType() {
        return type;
    }

    public List<String> getWeakness() {
        return weakness;
    }

    public List<String> getStrength() {
        return strength;
    }


}
