package Ability;
import Pokemon.Pokemon;


public abstract class WaterAbility extends Ability {
    private String type;

    public WaterAbility(Pokemon waterPokemon) {
        super(waterPokemon);
        type = "water";
    }

    @Override
    public String getType() {
        return type;
    }

}
