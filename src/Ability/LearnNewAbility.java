package Ability;

import Ability.ElectricAbilities.*;
import Ability.FireAbilities.*;
import Ability.GrassAbilities.*;
import Ability.WaterAbilities.*;
import Pokemon.Pokemon;

public class LearnNewAbility {
    private Pokemon pokemon;

    public LearnNewAbility(Pokemon pokemon) {
        this.pokemon = pokemon;
        if (pokemon.getType().equalsIgnoreCase("fire")){
            for (int i = 0; i <= pokemon.getStats().getLevel(); i++) {
                switch (i) {
                    case 1 -> pokemon.addAbility(new Ember(pokemon));
                    case 5 -> pokemon.addAbility(new Flame(pokemon));
                    case 10 -> pokemon.addAbility(new FlameThrower(pokemon));
                    case 15 -> pokemon.addAbility(new Blaze(pokemon));
                    case 20 -> pokemon.getAbilities().set(0, new FireBlast(pokemon));
                    case 25 -> pokemon.getAbilities().set(1, new Volcano(pokemon));
                }
            }
        } else if (pokemon.getType().equalsIgnoreCase("water")){
            for (int i = 0; i <= pokemon.getStats().getLevel(); i++) {
                switch (i) {
                    case 1 -> pokemon.addAbility(new WaterSpray(pokemon));
                    case 5 -> pokemon.addAbility(new WaterGun(pokemon));
                    case 10 -> pokemon.addAbility(new WaterPump(pokemon));
                    case 15 -> pokemon.addAbility(new PressurePump(pokemon));
                    case 20 -> pokemon.getAbilities().set(0, new HydroPump(pokemon));
                    case 25 -> pokemon.getAbilities().set(0, new Tsunami(pokemon));
                }
            }
        } else if (pokemon.getType().equalsIgnoreCase("grass")){
            for (int i = 0; i <= pokemon.getStats().getLevel(); i++) {
                switch (i) {
                    case 1 -> pokemon.addAbility(new SpitSeed(pokemon));
                    case 5 -> pokemon.addAbility(new GrassWave(pokemon));
                    case 10 -> pokemon.addAbility(new Absorb(pokemon));
                    case 15 -> pokemon.addAbility(new SeedBlast(pokemon));
                    case 20 -> pokemon.getAbilities().set(0, new GrassStorm(pokemon));
                    case 25 -> pokemon.getAbilities().set(0, new FlowerPower(pokemon));
                }
            }
        }

         else if (pokemon.getType().equalsIgnoreCase("electric")) {
            for (int i = 0; i <= pokemon.getStats().getLevel(); i++) {
                switch (i) {
                    case 1 -> pokemon.addAbility(new Spark(pokemon));
                }
            }
        }
    }

    public void learnAbilitiesOnLeveling() {
        if (pokemon.getType().equalsIgnoreCase("fire")){
                switch (pokemon.getStats().getLevel()) {
                    case 1 -> pokemon.addAbility(new Ember(pokemon));
                    case 5 -> pokemon.addAbility(new Flame(pokemon));
                    case 10 -> pokemon.addAbility(new FlameThrower(pokemon));
                    case 15 -> pokemon.addAbility(new Blaze(pokemon));
                    case 20 -> pokemon.addAbility(new FireBlast(pokemon));
                    case 25 -> pokemon.addAbility(new Volcano(pokemon));
                }
        } else if (pokemon.getType().equalsIgnoreCase("water")){
                switch (pokemon.getStats().getLevel()) {
                    case 1 -> pokemon.addAbility(new WaterSpray(pokemon));
                    case 5 -> pokemon.addAbility(new WaterGun(pokemon));
                    case 10 -> pokemon.addAbility(new WaterPump(pokemon));
                    case 15 -> pokemon.addAbility(new PressurePump(pokemon));
                    case 20 -> pokemon.getAbilities().set(0, new HydroPump(pokemon));
                    case 25 -> pokemon.addAbility(new Tsunami(pokemon));
                }
            } else if (pokemon.getType().equalsIgnoreCase("grass")){
                switch (pokemon.getStats().getLevel()) {
                    case 1 -> pokemon.addAbility(new SpitSeed(pokemon));
                    case 5 -> pokemon.addAbility(new GrassWave(pokemon));
                    case 10 -> pokemon.addAbility(new Absorb(pokemon));
                    case 15 -> pokemon.addAbility(new SeedBlast(pokemon));
                    case 20 -> pokemon.addAbility(new GrassStorm(pokemon));
                    case 25 -> pokemon.addAbility(new FlowerPower(pokemon));
            }
        } else if (pokemon.getType().equalsIgnoreCase("electric")) {
                switch (pokemon.getStats().getLevel()) {
                    case 1 -> pokemon.addAbility(new Spark(pokemon));
                }
        }
        }
    }



