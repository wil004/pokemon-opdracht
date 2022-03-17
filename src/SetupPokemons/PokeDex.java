package SetupPokemons;

import Ability.LearnNewAbility;
import Pokemon.*;

import java.util.ArrayList;
import java.util.List;

public class PokeDex {
    private List<Pokemon> pokeDex;

    public PokeDex() {
        pokeDex = new ArrayList<>();

        pokeDex.add(new GrassPokemon("Bulbasaur", 5));
        pokeDex.add(new GrassPokemon("IvySaur", 15));
        pokeDex.add(new GrassPokemon("Venusaur", 25));
        pokeDex.add(new GrassPokemon("Caterpie", 3));
        pokeDex.add(new GrassPokemon("Metapod", 8));
        pokeDex.add(new GrassPokemon("Pinsir", 12));
        pokeDex.add(new GrassPokemon("Weedle", 5));
        pokeDex.add(new FirePokemon("Charmander", 5));
        pokeDex.add(new FirePokemon("Charmeleon", 15));
        pokeDex.add(new FirePokemon("Charizard", 25));
        pokeDex.add(new FirePokemon("Growlithe", 5));
        pokeDex.add(new FirePokemon("Arcanine", 10));
        pokeDex.add(new FirePokemon("Ponyta", 5));
        pokeDex.add(new FirePokemon("Rapidash", 12));
        pokeDex.add(new WaterPokemon("Squirtle", 5));
        pokeDex.add(new WaterPokemon("Wartortle", 15));
        pokeDex.add(new WaterPokemon("Blastoise", 25));
        pokeDex.add(new WaterPokemon("Seel", 3));
        pokeDex.add(new WaterPokemon("Horsea", 5));
        pokeDex.add(new WaterPokemon("Seadra", 10));
        pokeDex.add(new WaterPokemon("Staryu", 12));
        pokeDex.add(new ElectricPokemon("jolteon", 10));
        pokeDex.add(new ElectricPokemon("electrode", 5));
        pokeDex.add(new ElectricPokemon("Magneton", 10));
        pokeDex.add(new ElectricPokemon("Pikachu", 25));
        pokeDex.add(new ElectricPokemon("Raichu", 30));
        pokeDex.add(new ElectricPokemon("Zapdos", 35));
        pokeDex.add(new ElectricPokemon("Pichu", 1));
        for (Pokemon pokemon : pokeDex) {
            new LearnNewAbility(pokemon);
        }
    }

    public List<Pokemon> getPokeDex() { return pokeDex; };

}
