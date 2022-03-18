package Ability.FireAbilities;
import Ability.FireAbility;
import Pokemon.Pokemon;


public class Blaze extends FireAbility {
    private final int damage;
    private final String abilityName;

    public Blaze(Pokemon firePokemon) {
        super(firePokemon);
        int baseDamage = 70;
        this.damage = baseDamage + getDamageCalculation();
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

    @Override
    public void abilityDescription() {
        System.out.println("A fireblaze starts to haze");
    };
}
