package Pokemon;

import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final String type;
    private final List<String> weakness;
    private final List<String> strength;

    public GrassPokemon(String name, int level) {
        super(name, level);
        weakness = new ArrayList<>();
        strength = new ArrayList<>();
        type = "grass";
        weakness.add("fire");
        weakness.add("air");
        strength.add("water");
        strength.add("electric");
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