package Ability.FireAbilities;
import Ability.FireAbility;
import Pokemon.Pokemon;


public class FireBlast extends FireAbility {
    private final int damage;
    private final String abilityName;

    public FireBlast(Pokemon firePokemon) {
        super(firePokemon);
        int baseDamage = 80;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "FireBlast";
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
        System.out.println("A huge blast of fire taking over the air.");
    };
}
