package Fight;

import Pokemon.Pokemon;
import Stats.DamageCalculation;


import java.util.Random;
import java.util.Scanner;

public abstract class Fight {
    private final Pokemon pokemon1;
    private final Pokemon pokemon2;
    private final DamageCalculation battle;
    private final Random random;
    private final Scanner userInput;
    private boolean pokemon1Alive = true;
    private boolean pokemon2Alive = true;

    public Fight(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        userInput = new Scanner(System.in);
        this.battle = new DamageCalculation();
        random = new Random();
    }

    public void beginningPokemon() {
        if ((pokemon1.getStats().getSpeed() + 1) > pokemon2.getStats().getSpeed()) {
            System.out.println(pokemon1.getName() + " begins!");
        } else {
            System.out.println(pokemon2.getName() + " begins!");
        }
    }

    public DamageCalculation getBattle() {
        return battle;
    }

    public Scanner getUserInput() {
        return userInput;
    }

    public Random getRandom() {
        return random;
    }

    public abstract void pokemonBattle();

    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public Pokemon getPokemon2() {
        return pokemon2;
    }

    public boolean getPokemon1Alive() {
        return pokemon1Alive;
    }

    public boolean getPokemon2Alive() {
        return pokemon2Alive;
    }

    public void setPokemon1Alive(Boolean alive) {
        this.pokemon1Alive = alive;
    }

    public void setPokemon2Alive(Boolean alive) {
        this.pokemon2Alive = alive;
    }



}
