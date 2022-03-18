package Ability.GrassAbilities;
import Ability.GrassAbility;
import Pokemon.Pokemon;

public class Absorb extends GrassAbility {
    private final int damage;
    private final String abilityName;

    public Absorb(Pokemon grassPokemon) {
        super(grassPokemon);
        int baseDamage = 50;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "Absorb";
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
        System.out.println("Absorbing life out of the opponent!");
    };
}