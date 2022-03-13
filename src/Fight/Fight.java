package Fight;

import Pokemon.Pokemon;
import Stats.DamageCalculation;
import Stats.ExperienceCalculation;

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
        this.battle = new DamageCalculation();
    }

    public void beginner() {
        if ((pokemon1.getStats().getSpeed() + 1) > pokemon2.getStats().getSpeed()) {
            System.out.println(pokemon1.getName() + " begins!");
        } else {
            System.out.println(pokemon2.getName() + " begins!");
        }
    }

    public void pokemonBattle() {
        ExperienceCalculation pokemon1Xp = new ExperienceCalculation(this.pokemon1);
        ExperienceCalculation pokemon2Xp = new ExperienceCalculation(this.pokemon2);
        System.out.println("Pokemon Battle starts");
        while (pokemon1Alive && pokemon2Alive) {
            if ((pokemon1.getStats().getSpeed() + 1) > pokemon2.getStats().getSpeed()) {
                if (pokemon1.getStats().getCurrentHp() > 0) {
                    System.out.println(pokemon1.getName() + " choose an attack: ");
                    for (int i = 0; i < pokemon1.getAbilities().size(); i++) {
                        System.out.println("Typ: " + i + " voor " + pokemon1.getAbilities().get(i).getAbilityName());
                    }
                    int pokemon1Input = userInput.nextInt();
                    battle.pokemonAttack(pokemon1Input, pokemon1, pokemon2);
                }
                if (pokemon2.getStats().getCurrentHp() > 0) {
                    System.out.println(pokemon2.getName() + " choose an attack: ");
                    for (int i = 0; i < pokemon2.getAbilities().size(); i++) {
                        System.out.println("Typ: " + i + " voor " + pokemon2.getAbilities().get(i).getAbilityName());
                    }
                    int pokemon2Input = userInput.nextInt();
                    battle.pokemonAttack(pokemon2Input, pokemon2, pokemon1);
                }
            } else {
                if (pokemon2.getStats().getCurrentHp() > 0) {
                    System.out.println(pokemon2.getName() + " choose an attack: ");
                    for (int i = 0; i < pokemon2.getAbilities().size(); i++) {
                        System.out.println("Typ: " + i + " voor " + pokemon2.getAbilities().get(i).getAbilityName());
                    }
                    int pokemon2Input = userInput.nextInt();
                    battle.pokemonAttack(pokemon2Input, pokemon2, pokemon1);
                }

                if (pokemon1.getStats().getCurrentHp() > 0) {
                    System.out.println(pokemon1.getName() + " choose an attack: ");
                    for (int i = 0; i < pokemon1.getAbilities().size(); i++) {
                        System.out.println("Typ: " + i + " voor " + pokemon1.getAbilities().get(i).getAbilityName());
                    }
                    int pokemon1Input = userInput.nextInt();
                    battle.pokemonAttack(pokemon1Input, pokemon1, pokemon2);
                }
            };
            if (pokemon1.getStats().getCurrentHp() <= 0) {
                this.pokemon1Alive = false;
                System.out.println(pokemon1.getName() + " died!");
                System.out.println(pokemon2.getName() + " won!");
                pokemon1Xp.gainExperience(pokemon2, pokemon1);
            } else if (pokemon2.getStats().getCurrentHp() <= 0) {
                this.pokemon2Alive = false;
                System.out.println(pokemon2.getName() + " died!");
                System.out.println(pokemon1.getName() + " won!");
                pokemon2Xp.gainExperience(pokemon1, pokemon2);

            }
        }
    }
}
