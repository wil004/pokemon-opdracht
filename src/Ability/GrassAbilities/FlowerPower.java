package Ability.GrassAbilities;
import Ability.GrassAbility;
import Pokemon.Pokemon;


public class FlowerPower extends GrassAbility {
    private final int damage;
    private final String abilityName;

    public FlowerPower(Pokemon grassPokemon) {
        super(grassPokemon);
        int baseDamage = 110;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "FlowerPower";
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