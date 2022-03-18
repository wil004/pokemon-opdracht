package Ability.FireAbilities;
import Ability.FireAbility;
import Pokemon.Pokemon;


public class Flame extends FireAbility {
    private final int damage;
    private final String abilityName;

    public Flame(Pokemon firePokemon) {
        super(firePokemon);
        int baseDamage = 30;
        this.damage = baseDamage + getDamageCalculation();
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

    @Override
    public void abilityDescription() {
        System.out.println("A normal sized flame is summoned!");
    };
}
