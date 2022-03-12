package Ability;

import Ability.FireAbilities.*;
import Ability.WaterAbilities.*;
import Pokemon.Pokemon;

public class LearnNewAbility {
    private Pokemon pokemon;

    public LearnNewAbility(Pokemon pokemon) {
        this.pokemon = pokemon;
        if (pokemon.getType().equalsIgnoreCase("fire")) {
            if (pokemon.getStats().getLevel() >= 1) {
                pokemon.addAbility(new Ember(pokemon));
            } if (pokemon.getStats().getLevel() >= 5) {
                pokemon.addAbility(new Flame(pokemon));
            } if (pokemon.getStats().getLevel() >= 10) {
                pokemon.addAbility(new FlameThrower(pokemon));
            }
            if (pokemon.getStats().getLevel() >= 15) {
                pokemon.addAbility(new Blaze(pokemon));
            }
            if (pokemon.getStats().getLevel() >= 20) {
                pokemon.addAbility(new FireBlast(pokemon));
            }
            if (pokemon.getStats().getLevel() >= 25) {
                pokemon.addAbility(new Volcano(pokemon));
            }
         } else if (pokemon.getType().equalsIgnoreCase("water")) {
            if (pokemon.getStats().getLevel() >= 1) {
                    pokemon.addAbility(new WaterSpray(pokemon));
            } if (pokemon.getStats().getLevel() >= 5) {
                pokemon.addAbility(new WaterGun(pokemon));
            } if (pokemon.getStats().getLevel() >= 10) {
                pokemon.addAbility(new WaterPump(pokemon));
            } if (pokemon.getStats().getLevel() >= 15) {
                pokemon.addAbility(new PressurePump(pokemon));
            } if (pokemon.getStats().getLevel() >= 20) {
                pokemon.addAbility(new HydroPump(pokemon));
            } if (pokemon.getStats().getLevel() >= 25) {
                pokemon.addAbility(new Tsunami(pokemon));
            }
        }
    }

    public void learnAbilitiesList() {
        if (pokemon.getType().equalsIgnoreCase("fire")){
                switch (pokemon.getStats().getLevel()) {
                    case 1 -> pokemon.addAbility(new Ember(pokemon));
                    case 5 -> pokemon.addAbility(new Flame(pokemon));
                    case 10 -> pokemon.addAbility(new FlameThrower(pokemon));
                    case 15 -> pokemon.addAbility(new Blaze(pokemon));
                    case 20 -> pokemon.addAbility(new FireBlast(pokemon));
                    case 25 -> pokemon.addAbility(new Volcano(pokemon));
                }
        }
        }
    }



