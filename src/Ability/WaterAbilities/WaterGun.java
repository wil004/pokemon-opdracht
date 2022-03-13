package Ability.WaterAbilities;
import Ability.WaterAbility;
import Pokemon.Pokemon;


public class WaterGun extends WaterAbility {
    private final int damage;
    private final String abilityName;

    public WaterGun(Pokemon waterPokemon) {
        super(waterPokemon);
        int baseDamage = 30;
        this.damage = baseDamage + waterPokemon.getStats().getAttack() / waterPokemon.getStats().getAttackFactor();
        this.abilityName = "WaterGun";
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