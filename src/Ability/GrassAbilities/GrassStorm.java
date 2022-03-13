package Ability.GrassAbilities;
import Ability.GrassAbility;
import Pokemon.Pokemon;


public class GrassStorm extends GrassAbility {
    private final int damage;
    private final String abilityName;

    public GrassStorm(Pokemon grassPokemon) {
        super(grassPokemon);
        int baseDamage = 80;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "GrassStorm";
    }

    @Override
    public int getDamage() {
        return damage;
    };

    @Override
    public String getAbilityName() {
        return abilityName;
    };
}