package Pokemon;

import Ability.*;

import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private String type;
    private final List<String> weakness;
    private final List<String> strength;


    public WaterPokemon(String name, int level) {
        super(name, level);
        weakness = new ArrayList<>();
        strength = new ArrayList<>();
        type = "water";
        weakness.add("grass");
        weakness.add("electric");
        strength.add("fire");
        strength.add("water");
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
