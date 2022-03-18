package Ability.GrassAbilities;
import Ability.GrassAbility;
import Pokemon.Pokemon;


public class SeedBlast extends GrassAbility {
    private final int damage;
    private final String abilityName;

    public SeedBlast(Pokemon grassPokemon) {
        super(grassPokemon);
        int baseDamage = 65;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "SeedBlast";
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
        System.out.println("A blast of seeds hit the opponent!");
    };
}