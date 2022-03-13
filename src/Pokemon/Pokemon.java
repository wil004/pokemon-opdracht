package Pokemon;

import Ability.Ability;
import Stats.Stats;

import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon {
    private String name;
    private Stats stats;
    private List<Ability> abilities;

    public Pokemon(String name, int level, List<Ability> abilities) {
      this.name = name;
      this.abilities = abilities;
      this.stats = new Stats(level);
    }

    public Pokemon(String name, int level) {
        this.name = name;
        this.abilities = new ArrayList<>();
        this.stats = new Stats(level);
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public String getName() {
        return name;
    }

    public Stats getStats() {
        return stats;
    }

    public void setLevelUp() {
      stats.setLevelUp();

    }

    public abstract void addAbility(Ability ability);

    public abstract String getType();

    public abstract void pokemonType();

    public abstract String getWeakness();

    public abstract String getStrength();

}
