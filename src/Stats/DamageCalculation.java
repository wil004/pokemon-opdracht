package Stats;

import Pokemon.Pokemon;

import java.util.Scanner;

public class DamageCalculation {

    private int damage;

    public DamageCalculation() {

    }

    public void pokemonAttack(int attackChoice, Pokemon attackPokemon, Pokemon pokemonDefendingPokemon) {
        if (pokemonDefendingPokemon.getWeakness().contains(attackPokemon.getAbilities().get(attackChoice).getType())) {
            damage = ((attackPokemon.getAbilities().get(attackChoice).getDamage()) - (pokemonDefendingPokemon.getStats().getDefence() / 3)) * 3;
            if (damage <= 0) {
                damage = 5;
            }
            pokemonDefendingPokemon.getStats().setCurrentHpDamaged(pokemonDefendingPokemon.getStats().getCurrentHp(), damage);
            System.out.println(attackPokemon.getName() + " attacks with " + attackPokemon.getAbilities().get(attackChoice).getAbilityName());
            System.out.println("");
            System.out.println("Super effective attack!!!");
            System.out.println("");
            System.out.println(pokemonDefendingPokemon.getName() + " takes " + this.damage + " damage " +
                    pokemonDefendingPokemon.getStats().getHp() + " / " + pokemonDefendingPokemon.getStats().getCurrentHp());
        }
        else if(pokemonDefendingPokemon.getStrength().contains(attackPokemon.getAbilities().get(attackChoice).getType())) {
            damage = ((attackPokemon.getAbilities().get(attackChoice).getDamage()) - (pokemonDefendingPokemon.getStats().getDefence() / 3)) / 4;
            if (damage <= 0) {
                damage = 5;
            }
            pokemonDefendingPokemon.getStats().setCurrentHpDamaged(pokemonDefendingPokemon.getStats().getCurrentHp(), damage);
            System.out.println(attackPokemon.getName() + " attacks with " + attackPokemon.getAbilities().get(attackChoice).getAbilityName());
            System.out.println("");
            System.out.println("not very effective attack!!!");
            System.out.println("");
            System.out.println(pokemonDefendingPokemon.getName() + " takes " + this.damage + " damage " +
                    pokemonDefendingPokemon.getStats().getHp() + " / " + pokemonDefendingPokemon.getStats().getCurrentHp());
        } else {
            damage = (attackPokemon.getAbilities().get(attackChoice).getDamage()) - (pokemonDefendingPokemon.getStats().getDefence() / 3);
            if (damage <= 0) {
                damage = 5;
            }
            pokemonDefendingPokemon.getStats().setCurrentHpDamaged(pokemonDefendingPokemon.getStats().getCurrentHp(), damage);
            System.out.println(attackPokemon.getName() + " attacks with " + attackPokemon.getAbilities().get(attackChoice).getAbilityName());
            System.out.println(pokemonDefendingPokemon.getName() + " takes " + this.damage + " damage " +
                    pokemonDefendingPokemon.getStats().getHp() + " / " + pokemonDefendingPokemon.getStats().getCurrentHp());
        }
    }


}
