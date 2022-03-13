package Ability.WaterAbilities;
import Ability.WaterAbility;
import Pokemon.Pokemon;


public class Tsunami extends WaterAbility {
    private final int damage;
    private final String abilityName;

    public Tsunami(Pokemon waterPokemon) {
        super(waterPokemon);
        int baseDamage = 110;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "Tsunami";
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