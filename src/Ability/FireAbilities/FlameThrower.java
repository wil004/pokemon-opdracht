package Ability.FireAbilities;
import Ability.FireAbility;
import Pokemon.Pokemon;


public class FlameThrower extends FireAbility {
    private final int damage;
    private final String abilityName;

    public FlameThrower(Pokemon firePokemon) {
        super(firePokemon);
        int baseDamage = 50;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "FlameThrower";
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
