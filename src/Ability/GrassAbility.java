package Ability;
import Pokemon.Pokemon;


public abstract class GrassAbility extends Ability {
    private String type;

    public GrassAbility(Pokemon grassPokemon) {
        super(grassPokemon);
        type = "grass";
    }

    @Override
    public String getType() {
        return type;
    }
}