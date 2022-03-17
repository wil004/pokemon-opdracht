package Ability.GrassAbilities;
import Ability.GrassAbility;
import Pokemon.Pokemon;


public class GrassWave extends GrassAbility {
    private final int damage;
    private final String abilityName;

    public GrassWave(Pokemon grassPokemon) {
        super(grassPokemon);
        int baseDamage = 35;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "GrassWave";
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