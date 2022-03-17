package Ability.WaterAbilities;
import Ability.WaterAbility;
import Pokemon.Pokemon;


public class HydroPump extends WaterAbility {
    private final int damage;
    private final String abilityName;

    public HydroPump(Pokemon waterPokemon) {
        super(waterPokemon);
        int baseDamage = 80;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "HydroPump";
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