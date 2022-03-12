package Pokemon;

import Ability.Ability;

public class WaterPokemon extends Pokemon {
    private String type;
    private String weakness;
    private String strength;
    private String neutral;

    public WaterPokemon(String name, int level) {
        super(name, level);
        type = "Water";
        weakness = "Grass";
        strength = "Fire";
        neutral = "Electric";
    }

    @Override
    public void addAbility(Ability waterAbility) {
        if(waterAbility.getType().equalsIgnoreCase("water")) {
            getAbilities().add(waterAbility);
        }
            else {
                System.out.println("This pokemon cannot learn a water ability");
            }
        }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void pokemonType() {
        System.out.println("This is a water pokemon.");
    }

    public String getWeakness() {
        return weakness;
    }

    public String getStrength() {
        return strength;
    }

}
