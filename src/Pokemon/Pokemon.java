package Pokemon;

import Stats.Stats;

import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon {
    private String name;
    private Stats stats;
    private String subType;

    private List<String> allAbilities;

    public Pokemon(String name, int level) {
        this.name = name;
        this.stats = new Stats(level);
        this.allAbilities = new ArrayList<>();
    }

    public Pokemon(String name, int level, String subType) {
        this.name = name;
        this.stats = new Stats(level);
        this.subType = subType;
        this.allAbilities = new ArrayList<>();
    }

    public String getSubType() {
        return subType;
    }

    public List<String> getAllAbilities() {
        return allAbilities;
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

    public abstract String getType();

    public abstract void setType(String type);

    public abstract List<String> getWeakness();

    public abstract List<String> getStrength();

}
