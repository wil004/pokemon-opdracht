package Ability.ElectricAbilities;
import Ability.ElectricAbility;
import Pokemon.Pokemon;

public class ThunderStorm extends ElectricAbility {
    private final int damage;
    private final String abilityName;

    public ThunderStorm(Pokemon electricPokemon) {
        super(electricPokemon);
        int baseDamage = 110;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "ThunderStorm";
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
        System.out.println("A storm of thundershocks devastating the opponent!");
    };
}