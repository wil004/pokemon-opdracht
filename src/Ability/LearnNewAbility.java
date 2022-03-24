package Ability;
import Pokemon.Pokemon;

public class LearnNewAbility {
    private Pokemon pokemon;

    public LearnNewAbility(Pokemon pokemon) {
        this.pokemon = pokemon;
        if (pokemon.getType().equalsIgnoreCase("fire")){
            for (int i = 0; i <= pokemon.getStats().getLevel(); i++) {
                switch (i) {
                    case 1 -> pokemon.getAllAbilities().add("ember");
                    case 5 -> pokemon.getAllAbilities().add("flame");
                    case 10 -> pokemon.getAllAbilities().add("blaze");
                    case 15 -> pokemon.getAllAbilities().add("fireBlast");
                    case 20 -> pokemon.getAllAbilities().set(0, "flamethrower");
                    case 25 -> pokemon.getAllAbilities().set(1, "volcano");
                }
            }
        } else if (pokemon.getType().equalsIgnoreCase("water")){
            for (int i = 0; i <= pokemon.getStats().getLevel(); i++) {
                switch (i) {
                    case 1 -> pokemon.getAllAbilities().add("waterSpray");
                    case 5 -> pokemon.getAllAbilities().add("waterGun");
                    case 10 -> pokemon.getAllAbilities().add("waterPump");
                    case 15 -> pokemon.getAllAbilities().add("pressurePump");
                    case 20 -> pokemon.getAllAbilities().set(0, "hydroPump");
                    case 25 -> pokemon.getAllAbilities().set(1, "tsunami");
                }
            }
        } else if (pokemon.getType().equalsIgnoreCase("grass")){
            for (int i = 0; i <= pokemon.getStats().getLevel(); i++) {
                switch (i) {
                    case 1 -> pokemon.getAllAbilities().add("absorb");
                    case 5 -> pokemon.getAllAbilities().add("spitSeed");
                    case 10 -> pokemon.getAllAbilities().add("seedBlast");
                    case 15 -> pokemon.getAllAbilities().add("grassWave");
                    case 20 -> pokemon.getAllAbilities().set(0, "grassStorm");
                    case 25 -> pokemon.getAllAbilities().set(1, "flowerpower");
                }
            }
        }

         else if (pokemon.getType().equalsIgnoreCase("electric")) {
            for (int i = 0; i <= pokemon.getStats().getLevel(); i++) {
                switch (i) {
                    case 1 -> pokemon.getAllAbilities().add("spark");
                    case 5 -> pokemon.getAllAbilities().add("shock");
                    case 10 -> pokemon.getAllAbilities().add("shockWave");
                    case 15 -> pokemon.getAllAbilities().add("electricBeam");
                    case 20 -> pokemon.getAllAbilities().set(0, "thunder");
                    case 25 -> pokemon.getAllAbilities().set(1, "thunderStorm");
                }
            }
        }
    }

    public void learnAbilitiesOnLeveling() {
        if (pokemon.getType().equalsIgnoreCase("fire")){
                switch (pokemon.getStats().getLevel()) {
                    case 1 -> pokemon.getAllAbilities().add("ember");
                    case 5 -> pokemon.getAllAbilities().add("flame");
                    case 10 -> pokemon.getAllAbilities().add("blaze");
                    case 15 -> pokemon.getAllAbilities().add("fireblast");
                    case 20 -> pokemon.getAllAbilities().set(0, "flamethrower");
                    case 25 -> pokemon.getAllAbilities().set(1, "volcano");
                }
        } else if (pokemon.getType().equalsIgnoreCase("water")){
                switch (pokemon.getStats().getLevel()) {
                    case 1 -> pokemon.getAllAbilities().add("waterSpray");
                    case 5 -> pokemon.getAllAbilities().add("waterGun");
                    case 10 -> pokemon.getAllAbilities().add("waterPump");
                    case 15 -> pokemon.getAllAbilities().add("pressurePump");
                    case 20 -> pokemon.getAllAbilities().set(0, "hydroPump");
                    case 25 -> pokemon.getAllAbilities().set(1, "tsunami");
                }
            } else if (pokemon.getType().equalsIgnoreCase("grass")){
                switch (pokemon.getStats().getLevel()) {
                    case 1 -> pokemon.getAllAbilities().add("absorb");
                    case 5 -> pokemon.getAllAbilities().add("spitSeed");
                    case 10 -> pokemon.getAllAbilities().add("seedBlast");
                    case 15 -> pokemon.getAllAbilities().add("grassWave");
                    case 20 -> pokemon.getAllAbilities().set(0, "grassStorm");
                    case 25 -> pokemon.getAllAbilities().set(1, "flowerpower");
            }
        } else if (pokemon.getType().equalsIgnoreCase("electric")) {
                switch (pokemon.getStats().getLevel()) {
                    case 1 -> pokemon.getAllAbilities().add("spark");
                    case 5 -> pokemon.getAllAbilities().add("shock");
                    case 10 -> pokemon.getAllAbilities().add("shockWave");
                    case 15 -> pokemon.getAllAbilities().add("electricBeam");
                    case 20 -> pokemon.getAllAbilities().set(0, "thunder");
                    case 25 -> pokemon.getAllAbilities().set(1, "thunderStorm");
                }
        }
        }
    }



