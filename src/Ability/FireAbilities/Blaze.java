package Ability.FireAbilities;
import Ability.FireAbility;
import Pokemon.Pokemon;


public class Blaze extends FireAbility {
    private final int damage;
    private final String abilityName;

    public Blaze(Pokemon firePokemon) {
        super(firePokemon);
        int baseDamage = 65;
        this.damage = baseDamage + firePokemon.getStats().getAttack() / firePokemon.getStats().getAttackFactor();
        this.abilityName = "Blaze";
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
