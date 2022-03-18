package Ability.ElectricAbilities;
import Ability.ElectricAbility;
import Pokemon.Pokemon;

public class Thunder extends ElectricAbility {
    private final int damage;
    private final String abilityName;

    public Thunder(Pokemon electricPokemon) {
        super(electricPokemon);
        int baseDamage = 80;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "Thunder";
    }

    @Override
    public int getDamage() {
        return damage;
    };

    @Override
    public String getAbilityName() {
        return abilityName;
    };

    @Override
    public void abilityDescription() {
        System.out.println("A thunder shock falling down on the opponent!");
    };
}