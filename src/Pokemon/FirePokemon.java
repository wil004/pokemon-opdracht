package Pokemon;

import Ability.Ability;

public class FirePokemon extends Pokemon {
    private String type;
    private String weakness;
    private String strength;
    private String neutral;

    public FirePokemon(String name, int level) {
        super(name, level);
        type = "Fire";
        weakness = "Water";
        strength = "Grass";
        neutral = "Electric";
    }
    @Override
    public void addAbility(Ability fireAbility) {
        if(fireAbility.getType().equalsIgnoreCase("fire")) {
            getAbilities().add(fireAbility);
        } else {
            System.out.println("This pokemon cannot learn this ability");
        }
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void pokemonType() {
        System.out.println("This is a fire pokemon.");
    }

    public String getWeakness() {
        return weakness;
    }

    public String getStrength() {
        return strength;
    }


}
