package Ability.FireAbilities;
import Ability.FireAbility;
import Pokemon.Pokemon;

public class Ember extends FireAbility {
    private final int damage;
    private final String abilityName;

    public Ember(Pokemon firePokemon) {
        super(firePokemon);
        int baseDamage = 20;
        this.damage = baseDamage + firePokemon.getStats().getAttack() / firePokemon.getStats().getAttackFactor();
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

}
