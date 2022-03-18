package Ability;
import Pokemon.Pokemon;
import Stats.Stats;

public abstract class Ability {
    private Stats stats;
    private int damageCalculation;

    public Ability(Pokemon pokemon) {
        this.stats = pokemon.getStats();
        this.damageCalculation = pokemon.getStats().getAttack() / pokemon.getStats().getAttackFactor();
    }

    public Stats getStats() {
        return stats;
    }

    public int getDamageCalculation() {
        return damageCalculation;
    }

    public abstract int getDamage();

    public abstract String getAbilityName();

    public abstract String getType();

    public abstract void abilityDescription();
}