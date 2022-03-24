import Ability.LearnNewAbility;
import Fight.Fight;
import Person.*;
import Pokemon.Pokemon;
import Pokemon.FirePokemon;
import Pokemon.WaterPokemon;
import Pokemon.ElectricPokemon;
import Pokemon.GrassPokemon;
import Fight.*;
import SetupPokemons.PokeDex;

public class Main {
    public static void main(String[] args) {
        PokeDex hoi = new PokeDex();

        Person william = new Player("William");
        Person electric = new GymLeader("electricMaster", "electric");
        GiveCharacterPokemon.givePokemons(hoi, william);
        GiveCharacterPokemon.givePokemons(hoi, electric);

        System.out.println(william.getName() + "'s pokemons");
        for(int i = 0; i < william.getPokemonList().size(); i++) {
            System.out.println(william.getPokemonList().get(i).getName() + " | lvl:" + william.getPokemonList().get(i).getStats().getLevel());
        }
        System.out.println("------------------");
        System.out.println(electric.getName() + "'s pokemons");
        for(int i = 0; i < electric.getPokemonList().size(); i++) {
            System.out.println(electric.getPokemonList().get(i).getName() + " | lvl:" + electric.getPokemonList().get(i).getStats().getLevel());
        }
        System.out.println("Battle begins");
        System.out.println("-------------");

        PlayerBattle williamhenk = new PlayerBattle(william, electric);
        williamhenk.playerBattlePvm();
    }
}
