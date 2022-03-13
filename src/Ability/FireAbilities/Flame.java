package Ability.FireAbilities;
import Ability.FireAbility;
import Pokemon.Pokemon;


public class Flame extends FireAbility {
    private final int damage;
    private final String abilityName;

    public Flame(Pokemon firePokemon) {
        super(firePokemon);
        int baseDamage = 30;
        this.damage = baseDamage + firePokemon.getStats().getAttack() / firePokemon.getStats().getAttackFactor();
        this.abilityName = "Flame";
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
