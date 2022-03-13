package Ability;
import Pokemon.Pokemon;
import Stats.Stats;

public abstract class Ability {
    private Stats stats;

    public Ability(Pokemon pokemon) {
        this.stats = pokemon.getStats();
    }

    public Stats getStats() {
        return stats;
    }

    public abstract int getDamage();

    public abstract String getAbilityName();

    public abstract String getType();
}
