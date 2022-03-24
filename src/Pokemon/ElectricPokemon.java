package Pokemon;

import java.util.ArrayList;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private String type;
    private final List<String> weakness;
    private final List<String> strength;


    public ElectricPokemon(String name, int level) {
        super(name, level);
        weakness = new ArrayList<>();
        strength = new ArrayList<>();
        type = "electric";
        weakness.add("fire");
        weakness.add("grass");
        strength.add("rock");
        strength.add("air");
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
    }

    public List<String> getWeakness() {
        return weakness;
    }

    public List<String> getStrength() {
        return strength;
    }

}