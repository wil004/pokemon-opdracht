package Ability;
import Pokemon.Pokemon;


public abstract class FireAbility extends Ability {
    private String type;

    public FireAbility(Pokemon firePokemon) {
        super(firePokemon);
        type = "fire";
    }

    @Override
    public String getType() {
        return type;
    }


}
