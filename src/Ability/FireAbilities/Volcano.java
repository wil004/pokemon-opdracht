package Ability.FireAbilities;
import Ability.FireAbility;
import Pokemon.Pokemon;


public class Volcano extends FireAbility {
    private final int damage;
    private final String abilityName;

    public Volcano(Pokemon firePokemon) {
        super(firePokemon);
        int baseDamage = 110;
        this.damage = baseDamage + firePokemon.getStats().getAttack() / firePokemon.getStats().getAttackFactor();
        this.abilityName = "Volcano";
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
