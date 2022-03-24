package Ability;

import Pokemon.*;

public class AllAbilities {
    private static int damage;
    private static String type;


    public static int waterSpray(Pokemon attackingPokemon) {
        type = "water";
       int baseDamage = 20;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int waterGun(Pokemon attackingPokemon) {
        type = "water";
        int baseDamage = 30;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int waterPump(Pokemon attackingPokemon) {
        type = "water";
        int baseDamage = 50;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }
    public static int pressurePump(Pokemon attackingPokemon) {
        type = "water";
        int baseDamage = 65;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }
    public static int hydroPump(Pokemon attackingPokemon) {
        type = "water";
        int baseDamage = 80;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }
    public static int tsunami(Pokemon attackingPokemon) {
        type = "water";
        int baseDamage = 110;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int ember(Pokemon attackingPokemon) {
        type = "fire";
        int baseDamage = 20;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int flame(Pokemon attackingPokemon) {
        type = "fire";
        int baseDamage = 30;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }
    public static int blaze(Pokemon attackingPokemon) {
        type = "fire";
        int baseDamage = 50;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int fireBlast(Pokemon attackingPokemon) {
        type = "fire";
        int baseDamage = 65;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }
    public static int flameThrower(Pokemon attackingPokemon) {
        type = "fire";
        int baseDamage = 80;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }
    public static int volcano(Pokemon attackingPokemon) {
        type = "fire";
        int baseDamage = 110;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int absorb(Pokemon attackingPokemon) {
        type = "grass";
        int baseDamage = 20;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int spitSeed(Pokemon attackingPokemon) {
        type = "grass";
        int baseDamage = 30;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }
    public static int seedBlast(Pokemon attackingPokemon) {
        type = "grass";
        int baseDamage = 50;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int grassWave(Pokemon attackingPokemon) {
        type = "grass";
        int baseDamage = 65;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int grassStorm(Pokemon attackingPokemon) {
        type = "grass";
        int baseDamage = 80;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int flowerPower(Pokemon attackingPokemon) {
        type = "grass";
        int baseDamage = 110;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int spark(Pokemon attackingPokemon) {
        type = "electric";
        int baseDamage = 20;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int shock(Pokemon attackingPokemon) {
        type = "electric";
        int baseDamage = 30;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int shockWave(Pokemon attackingPokemon) {
        type = "electric";
        int baseDamage = 50;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int electricBeam(Pokemon attackingPokemon) {
        type = "electric";
        int baseDamage = 65;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int thunder(Pokemon attackingPokemon) {
        type = "electric";
        int baseDamage = 80;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static int thunderStorm(Pokemon attackingPokemon) {
        type = "electric";
        int baseDamage = 110;
        damage = baseDamage + attackingPokemon.getStats().getAttack() / attackingPokemon.getStats().getAttackFactor();
        return damage;
    }

    public static String getType() {
        return type;
    }

}
