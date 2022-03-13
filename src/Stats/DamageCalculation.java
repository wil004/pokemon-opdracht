package Stats;

import Pokemon.Pokemon;

import java.util.Scanner;

public class DamageCalculation {
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private int damage;

    public DamageCalculation(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void pokemon1Attacks(int attackChoice) {
        if (pokemon1.getAbilities().get(attackChoice).getType().equalsIgnoreCase(pokemon2.getWeakness())) {
            damage = ((pokemon1.getAbilities().get(attackChoice).getDamage()) - (pokemon2.getStats().getDefence() / 3)) * 3;
            if (damage <= 0) {
                damage = 5;
            }
            pokemon2.getStats().setCurrentHpDamaged(pokemon2.getStats().getCurrentHp(), damage);
            System.out.println(pokemon1.getName() + " attacks with " + pokemon1.getAbilities().get(attackChoice).getAbilityName());
            System.out.println("");
            System.out.println("Super effective attack!!!");
            System.out.println("");
            System.out.println(pokemon2.getName() + " takes " + this.damage + " damage " +
                    pokemon2.getStats().getHp() + " / " + pokemon2.getStats().getCurrentHp());
        }
        else if(pokemon1.getAbilities().get(attackChoice).getType().equalsIgnoreCase(pokemon2.getStrength())) {
            damage = ((pokemon1.getAbilities().get(attackChoice).getDamage()) - (pokemon2.getStats().getDefence() / 3)) / 4;
            if (damage <= 0) {
                damage = 5;
            }
            pokemon2.getStats().setCurrentHpDamaged(pokemon2.getStats().getCurrentHp(), damage);
            System.out.println(pokemon1.getName() + " attacks with " + pokemon1.getAbilities().get(attackChoice).getAbilityName());
            System.out.println("");
            System.out.println("not very effective attack!!!");
            System.out.println("");
            System.out.println(pokemon2.getName() + " takes " + this.damage + " damage " +
                    pokemon2.getStats().getHp() + " / " + pokemon2.getStats().getCurrentHp());
        } else {
            damage = (pokemon1.getAbilities().get(attackChoice).getDamage()) - (pokemon2.getStats().getDefence() / 3);
            if (damage <= 0) {
                damage = 5;
            }
            pokemon2.getStats().setCurrentHpDamaged(pokemon2.getStats().getCurrentHp(), damage);
            System.out.println(pokemon1.getName() + " attacks with " + pokemon1.getAbilities().get(attackChoice).getAbilityName());
            System.out.println(pokemon2.getName() + " takes " + this.damage + " damage " +
                    pokemon2.getStats().getHp() + " / " + pokemon2.getStats().getCurrentHp());
        }
    }

    public void pokemon2Attacks(int attackChoice) {
        if (pokemon2.getAbilities().get(attackChoice).getType().equalsIgnoreCase(pokemon1.getWeakness())) {
            damage = (pokemon2.getAbilities().get(attackChoice).getDamage() - (pokemon1.getStats().getDefence() / 3)) * 3;
            if (damage <= 0) {
                damage = 5;
            }
            pokemon1.getStats().setCurrentHpDamaged(pokemon1.getStats().getCurrentHp(), damage);
            System.out.println(pokemon2.getName() + " attacks with " + pokemon2.getAbilities().get(attackChoice).getAbilityName());
            System.out.println("");
            System.out.println("Super effective attack!!!");
            System.out.println("");
            System.out.println(pokemon1.getName() + " takes " + this.damage + " damage " +
                    pokemon1.getStats().getHp() + " / " + pokemon1.getStats().getCurrentHp());
        }
        else if(pokemon2.getAbilities().get(attackChoice).getType().equalsIgnoreCase(pokemon1.getStrength())) {
            damage = (pokemon2.getAbilities().get(attackChoice).getDamage() - (pokemon1.getStats().getDefence() / 3)) / 4;
            if (damage <= 0) {
                damage = 5;
            }
            pokemon1.getStats().setCurrentHpDamaged(pokemon1.getStats().getCurrentHp(), damage);
            System.out.println(pokemon2.getName() + " attacks with " + pokemon2.getAbilities().get(attackChoice).getAbilityName());
            System.out.println("");
            System.out.println("not very effective attack!!!");
            System.out.println("");
            System.out.println(pokemon1.getName() + " takes " + this.damage + " damage " +
                    pokemon1.getStats().getHp() + " / " + pokemon1.getStats().getCurrentHp());
        } else {
            damage = pokemon2.getAbilities().get(attackChoice).getDamage() - (pokemon1.getStats().getDefence() / 3);
            if (damage <= 0) {
                damage = 5;
            }
            pokemon1.getStats().setCurrentHpDamaged(pokemon1.getStats().getCurrentHp(), damage);
            System.out.println(pokemon2.getName() + " attacks with " + pokemon2.getAbilities().get(attackChoice).getAbilityName());
            System.out.println(pokemon1.getName() + " takes " + this.damage + " damage " +
                    pokemon1.getStats().getHp() + " / " + pokemon1.getStats().getCurrentHp());
        }
    }


}
