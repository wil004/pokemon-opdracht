package Fight;

import Pokemon.Pokemon;
import Stats.DamageCalculation;

import java.util.Scanner;

public class Fight {
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private boolean pokemon1Alive = true;
    private boolean pokemon2Alive = true;
    private DamageCalculation battle;
    private Scanner userInput = new Scanner(System.in);

    public Fight(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.battle = new DamageCalculation(pokemon1, pokemon2);
    }

    public void stats() {
        System.out.println(pokemon1.getName() + " has " + (this.pokemon2.getStats().getSpeed() + 1) + " speed!");
        System.out.println(pokemon1.getName() + " has " + this.pokemon1.getStats().getAttack() + " attack!");
        System.out.println(pokemon1.getName() + " has " + this.pokemon1.getStats().getDefence() + " defence!");
        System.out.println(pokemon1.getName() + " has " + this.pokemon1.getStats().getHp() + " health points!");
        System.out.println("-----------------------------");
        System.out.println(pokemon2.getName() + " has " + this.pokemon2.getStats().getSpeed() + " speed!");
        System.out.println(pokemon2.getName() + " has " + this.pokemon2.getStats().getAttack() + " attack!");
        System.out.println(pokemon2.getName() + " has " + this.pokemon2.getStats().getDefence() + " defence!");
        System.out.println(pokemon2.getName() + " has " + this.pokemon2.getStats().getHp() + " health points!");
        System.out.println("------------------------------");
        if ((pokemon1.getStats().getSpeed() + 1) > pokemon2.getStats().getSpeed()) {
            System.out.println(pokemon1.getName() + " begins!");
        } else {
            System.out.println(pokemon2.getName() + " begins!");
        }
    }

    public void pokemonBattle() {
        System.out.println("Pokemon Battle starts");
        while (pokemon1Alive && pokemon2Alive) {
            if ((pokemon1.getStats().getSpeed() + 1) > pokemon2.getStats().getSpeed()) {
                if (pokemon1.getStats().getCurrentHp() > 0) {
                    System.out.println(pokemon1.getName() + " choose an attack: ");
                    for (int i = 0; i < pokemon1.getAbilities().size(); i++) {
                        System.out.println("Typ: " + i + " voor " + pokemon1.getAbilities().get(i).getAbilityName());
                    }
                    int pokemon1Input = userInput.nextInt();
                    battle.pokemon1Attacks(pokemon1Input);
                }
                if (pokemon2.getStats().getCurrentHp() > 0) {
                    System.out.println(pokemon2.getName() + " choose an attack: ");
                    for (int i = 0; i < pokemon2.getAbilities().size(); i++) {
                        System.out.println("Typ: " + i + " voor " + pokemon2.getAbilities().get(i).getAbilityName());
                    }
                    int pokemon2Input = userInput.nextInt();
                    battle.pokemon2Attacks(pokemon2Input);
                }
            } else {
                if (pokemon2.getStats().getCurrentHp() > 0) {
                    System.out.println(pokemon2.getName() + " choose an attack: ");
                    for (int i = 0; i < pokemon2.getAbilities().size(); i++) {
                        System.out.println("Typ: " + i + " voor " + pokemon2.getAbilities().get(i).getAbilityName());
                    }
                    int pokemon2Input = userInput.nextInt();
                    battle.pokemon2Attacks(pokemon2Input);
                }

                if (pokemon1.getStats().getCurrentHp() > 0) {
                    System.out.println(pokemon1.getName() + " choose an attack: ");
                    for (int i = 0; i < pokemon1.getAbilities().size(); i++) {
                        System.out.println("Typ: " + i + " voor " + pokemon1.getAbilities().get(i).getAbilityName());
                    }
                    int pokemon1Input = userInput.nextInt();
                    battle.pokemon1Attacks(pokemon1Input);
                }
            };
            if (pokemon1.getStats().getCurrentHp() <= 0) {
                this.pokemon1Alive = false;
                System.out.println(pokemon1.getName() + " died!");
                System.out.println(pokemon2.getName() + " won!");
            } else if (pokemon2.getStats().getCurrentHp() <= 0) {
                this.pokemon2Alive = false;
                System.out.println(pokemon2.getName() + " died!");
                System.out.println(pokemon1.getName() + " won!");
            }
        }
    }
}
