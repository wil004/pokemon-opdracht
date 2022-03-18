package Ability.FireAbilities;
import Ability.FireAbility;
import Pokemon.Pokemon;

public class Ember extends FireAbility {
    private final int damage;
    private final String abilityName;

    public Ember(Pokemon firePokemon) {
        super(firePokemon);
        int baseDamage = 25;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "ember";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getAbilityName() {
        return abilityName;
    };

    @Override
    public void abilityDescription() {
        System.out.println("A small flame is summoned!");
    };

}
