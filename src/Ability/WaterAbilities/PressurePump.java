package Ability.WaterAbilities;
import Ability.WaterAbility;
import Pokemon.Pokemon;


public class PressurePump extends WaterAbility {
    private final int damage;
    private final String abilityName;

    public PressurePump(Pokemon waterPokemon) {
        super(waterPokemon);
        int baseDamage = 65;
        this.damage = baseDamage + waterPokemon.getStats().getAttack() / waterPokemon.getStats().getAttackFactor();
        this.abilityName = "PressurePump";
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