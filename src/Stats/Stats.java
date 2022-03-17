package Stats;
import Pokemon.Pokemon;
import java.util.Random;

public class Stats {
    private int attack;
    private int defence;
    private int speed;
    private int hp;
    private int currentHp;
    private int level;
    private int experience;
    private boolean leveledUp;
    Random random = new Random();

    public Stats(int level) {
       this.level = level;
       this.attack = level * (random.nextInt(2) + 2);
       this.defence = level * (random.nextInt(2) + 2);
       this.speed = level * (random.nextInt(2) + 2);
       this.hp = level * (random.nextInt(15) + 7);
       this.currentHp = hp;
       this.experience = level * level * 500;
       this.leveledUp = false;
    }

    public void getStats(Pokemon pokemon) {
        System.out.println(pokemon.getName() + " level: " + pokemon.getStats().getLevel());
        System.out.println(pokemon.getName() + " has " + (pokemon.getStats().getSpeed() + 1) + " speed!");
        System.out.println(pokemon.getName() + " has " + pokemon.getStats().getAttack() + " attack!");
        System.out.println(pokemon.getName() + " has " + pokemon.getStats().getDefence() + " defence!");
        System.out.println(pokemon.getName() + " has " + pokemon.getStats().getHp() + "/" + pokemon.getStats().getCurrentHp() + " health points!");
        System.out.println("-----------------------------");
    }

    public int getAttackFactor() {
        return 5;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttackOnLevelUp() {
        this.attack = this.attack + random.nextInt(5);
    }

    public int getDefence() {
        return defence;
    }

    public void setDefenceOnLevelUp() {
        this.defence = this.defence + random.nextInt(5);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeedOnLevelUp() {
        this.speed = this.speed + random.nextInt(5);
    }

    public int getHp() {
        return hp;
    }

    public void setHp() {
        this.hp = this.hp + random.nextInt(3);
    }

    public int getCurrentHp() { return currentHp;}

    public void setCurrentHpDamaged(int currentHp, int damageTaken) {
        this.currentHp = currentHp - damageTaken;
    }

    public int getLevel() { return level; }

    public void setExperience(int experience) {
        this.experience = experience + this.experience;
    }

    public int getExperience() { return experience; }

    public int nextLevelExperience() { return (level+1) * (level+1) * 500; }

    public void setLevelUp() {
        this.level = level + 1;
        setSpeedOnLevelUp();
        setDefenceOnLevelUp();
        setAttackOnLevelUp();
        setHp();
        this.leveledUp = true;
    }

    public boolean getLeveledUp() {
        return leveledUp;
    }

    public void setLeveledUp() {
        this.leveledUp = false;
    }

}
