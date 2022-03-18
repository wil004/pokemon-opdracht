package Ability.WaterAbilities;
import Ability.WaterAbility;
import Pokemon.Pokemon;


public class WaterPump extends WaterAbility {
    private final int damage;
    private final String abilityName;

    public WaterPump(Pokemon waterPokemon) {
        super(waterPokemon);
        int baseDamage = 50;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "WaterPump";
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
        System.out.println("Lots of water pumps towards the opponent!");
    };
}