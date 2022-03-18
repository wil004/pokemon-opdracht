package Ability.ElectricAbilities;
import Ability.ElectricAbility;
import Pokemon.Pokemon;

public class ElectricBeam extends ElectricAbility {
    private final int damage;
    private final String abilityName;

    public ElectricBeam(Pokemon electricPokemon) {
        super(electricPokemon);
        int baseDamage = 60;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "ElectricBeam";
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
        System.out.println("Shoots a beam of electricity to the opponent!");
    };
}