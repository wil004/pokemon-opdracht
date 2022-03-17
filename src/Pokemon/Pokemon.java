package Pokemon;

import Ability.Ability;
import Stats.Stats;

import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon {
    private String name;
    private Stats stats;
    private String subType;
    private List<Ability> abilities;

    public Pokemon(String name, int level) {
        this.name = name;
        this.abilities = new ArrayList<>();
        this.stats = new Stats(level);
    }

    public Pokemon(String name, int level, String subType) {
        this.name = name;
        this.abilities = new ArrayList<>();
        this.stats = new Stats(level);
        this.subType = subType;
    }

    public String getSubType() {
        return subType;
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

    public abstract void setType(String type);

    public abstract List<String> getWeakness();

    public abstract List<String> getStrength();

}
