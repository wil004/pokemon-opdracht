package Ability.ElectricAbilities;
import Ability.ElectricAbility;
import Pokemon.Pokemon;

public class Shock extends ElectricAbility {
    private final int damage;
    private final String abilityName;

    public Shock(Pokemon electricPokemon) {
        super(electricPokemon);
        int baseDamage = 40;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "Shock";
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
        System.out.println("A powerfull shock strikes the opponent");
    };
}