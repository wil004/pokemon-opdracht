package Ability;
import Pokemon.Pokemon;

public abstract class ElectricAbility extends Ability {
    private String type;

    public ElectricAbility(Pokemon electricPokemon) {
        super(electricPokemon);
        type = "electric";
    }

    @Override
    public String getType() {
        return type;
    }

}