package Stats;

import Ability.Ability;
import Pokemon.Pokemon;

import java.util.Random;

public class Stats {
    private int attack;
    private int defence;
    private int speed;
    private int hp;
    private int currentHp;
    private int level;
    private boolean leveledUp;
    Random random = new Random();

    public Stats(int level) {
       this.level = level;
       this.attack = level * (random.nextInt(2) + 2);
       this.defence = level * (random.nextInt(2) + 2);
       this.speed = level * (random.nextInt(2) + 2);
       this.hp = level * (random.nextInt(15) + 7);
       this.currentHp = hp;
       this.leveledUp = false;
    }

    public int getAttackFactor() {
        return 20;
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

    public void setLevelUp() {
        this.level = level + 1;
        this.leveledUp = true;
    }

    public boolean getLeveledUp() {
        return leveledUp;
    }

    public void setLeveledUp() {
        this.leveledUp = false;
    }

}
