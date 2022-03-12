package Ability.WaterAbilities;
import Ability.WaterAbility;
import Pokemon.Pokemon;


public class WaterSpray extends WaterAbility {
    private final int damage;
    private final String abilityName;

    public WaterSpray(Pokemon waterPokemon) {
        super(waterPokemon);
        int baseDamage = 20;
        this.damage = baseDamage + waterPokemon.getStats().getAttack() / waterPokemon.getStats().getAttackFactor();
        this.abilityName = "WaterSpray";
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