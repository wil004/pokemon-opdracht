package Stats;

import Ability.AllAbilities;
import Pokemon.Pokemon;

public class DamageCalculation {

    private static int damage;
    private static String type;

    public static void pokemonAttackType(int attackChoice, Pokemon attackPokemon) {
        switch(attackPokemon.getAllAbilities().get(attackChoice).toLowerCase()) {
            case "ember":
            damage = AllAbilities.ember(attackPokemon);
            break;
            case "flame":
                damage = AllAbilities.flame(attackPokemon);
                break;
            case "blaze":
                damage = AllAbilities.blaze(attackPokemon);
                break;
            case "fireblast":
                damage = AllAbilities.fireBlast(attackPokemon);
                break;
            case "flamethrower":
                damage = AllAbilities.flameThrower(attackPokemon);
                break;
            case "volcano":
                damage = AllAbilities.volcano(attackPokemon);
                break;
            case "waterspray":
                damage = AllAbilities.waterSpray(attackPokemon);
                break;
            case "watergun":
                damage = AllAbilities.waterGun(attackPokemon);
                break;
            case "waterpump":
                damage = AllAbilities.waterPump(attackPokemon);
                break;
            case "pressurepump":
                damage = AllAbilities.pressurePump(attackPokemon);
                break;
            case "hydropump":
                damage = AllAbilities.hydroPump(attackPokemon);
                break;
            case "tsunami":
                damage = AllAbilities.tsunami(attackPokemon);
                break;
            case "absorb":
                damage = AllAbilities.absorb(attackPokemon);
                break;
            case "spitseed":
                damage = AllAbilities.spitSeed(attackPokemon);
                break;
            case "seedblast":
                damage = AllAbilities.seedBlast(attackPokemon);
                break;
            case "grasswave":
                damage = AllAbilities.grassWave(attackPokemon);
                break;
            case "grassstorm":
                damage = AllAbilities.grassStorm(attackPokemon);
                break;
            case "flowerpower":
                damage = AllAbilities.flowerPower(attackPokemon);
                break;
            case "spark":
                damage = AllAbilities.spark(attackPokemon);
                break;
            case "shock":
                damage = AllAbilities.shock(attackPokemon);
                break;
            case "shockwave":
                damage = AllAbilities.shockWave(attackPokemon);
                break;
            case "electricbeam":
                damage = AllAbilities.electricBeam(attackPokemon);
                break;
            case "thunder":
                damage = AllAbilities.thunder(attackPokemon);
                break;
            case "thunderstorm":
                damage = AllAbilities.thunderStorm(attackPokemon);
                break;
        }
        type = AllAbilities.getType();
    }

    public void pokemonAttack(int attackChoice, Pokemon attackPokemon, Pokemon pokemonDefendingPokemon) {
        pokemonAttackType(attackChoice, attackPokemon);
        if (pokemonDefendingPokemon.getWeakness().contains(type)) {
            damage = (damage - (pokemonDefendingPokemon.getStats().getDefence() / 3)) * 3;
            if (damage <= 0) {
                damage = 5;
            }
            pokemonDefendingPokemon.getStats().setCurrentHpDamaged(pokemonDefendingPokemon.getStats().getCurrentHp(), damage);
            System.out.println(attackPokemon.getName() + " attacks with " + attackPokemon.getAllAbilities().get(attackChoice));

            System.out.println("");
            System.out.println("Super effective attack!!!");
            System.out.println("");
            System.out.println(pokemonDefendingPokemon.getName() + " takes " + damage + " damage " +
                    pokemonDefendingPokemon.getStats().getHp() + " / " + pokemonDefendingPokemon.getStats().getCurrentHp());
            System.out.println("");
        }
        else if(pokemonDefendingPokemon.getStrength().contains(type)) {
            damage = (damage - (pokemonDefendingPokemon.getStats().getDefence() / 3)) / 4;
            if (damage <= 0) {
                damage = 5;
            }
            pokemonDefendingPokemon.getStats().setCurrentHpDamaged(pokemonDefendingPokemon.getStats().getCurrentHp(), damage);
            System.out.println(attackPokemon.getName() + " attacks with " + attackPokemon.getAllAbilities().get(attackChoice));

            System.out.println("");
            System.out.println("not very effective attack!!!");
            System.out.println("");
            System.out.println(pokemonDefendingPokemon.getName() + " takes " + damage + " damage " +
                    pokemonDefendingPokemon.getStats().getHp() + " / " + pokemonDefendingPokemon.getStats().getCurrentHp());
            System.out.println("");
        } else {
            damage = damage - (pokemonDefendingPokemon.getStats().getDefence() / 3);
            if (damage <= 0) {
                damage = 5;
            }
            pokemonDefendingPokemon.getStats().setCurrentHpDamaged(pokemonDefendingPokemon.getStats().getCurrentHp(), damage);
            System.out.println(attackPokemon.getName() + " attacks with " + attackPokemon.getAllAbilities().get(attackChoice));

            System.out.println(pokemonDefendingPokemon.getName() + " takes " + damage + " damage " +
                    pokemonDefendingPokemon.getStats().getHp() + " / " + pokemonDefendingPokemon.getStats().getCurrentHp());
            System.out.println("");
        }
    }



}
