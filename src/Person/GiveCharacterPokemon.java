package Person;
import SetupPokemons.PokeDex;
import java.util.Random;

public class GiveCharacterPokemon {

        public static void givePokemons(PokeDex pokeDex, Person player) {
            Random random = new Random();
            for (int i = 0; i < pokeDex.getPokeDex().size(); i++) {
                if (player.getPokemonType().equalsIgnoreCase("electric")) {
                    if (pokeDex.getPokeDex().get(i).getType().equals("electric") && player.getPokemonList().size() < 6) {
                        player.getPokemonList().add(pokeDex.getPokeDex().get(i));
                    }
                } else if (player.getPokemonType().equalsIgnoreCase("fire")) {
                    if (pokeDex.getPokeDex().get(i).getType().equals("fire") && player.getPokemonList().size() < 6) {
                        player.getPokemonList().add(pokeDex.getPokeDex().get(i));
                    }
                } else if (player.getPokemonType().equalsIgnoreCase("grass")) {
                    if (pokeDex.getPokeDex().get(i).getType().equals("grass") && player.getPokemonList().size() < 6) {
                        player.getPokemonList().add(pokeDex.getPokeDex().get(i));
                    }
                } else if (player.getPokemonType().equalsIgnoreCase("water")) {
                    if (pokeDex.getPokeDex().get(i).getType().equals("water") && player.getPokemonList().size() < 6) {
                        player.getPokemonList().add(pokeDex.getPokeDex().get(i));
                    }
                } else if (player.getPokemonType().equalsIgnoreCase("all")) {
                    if (player.getPokemonList().size() < 6) {
                        player.getPokemonList().add(pokeDex.getPokeDex().get(random.nextInt(pokeDex.getPokeDex().size() - 1)));
                    }
                }
            }
        }

    }
