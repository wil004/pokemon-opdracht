package Ability.ElectricAbilities;
import Ability.ElectricAbility;
import Pokemon.Pokemon;

public class ShockWave extends ElectricAbility {
    private final int damage;
    private final String abilityName;

    public ShockWave(Pokemon electricPokemon) {
        super(electricPokemon);
        int baseDamage = 50;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "ShockWave";
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
        System.out.println("A shocking wave of thunder!");
    };
}