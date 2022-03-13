import Ability.LearnNewAbility;
import Fight.Fight;
import Pokemon.Pokemon;
import Pokemon.FirePokemon;
import Pokemon.WaterPokemon;
import Pokemon.ElectricPokemon;
import Pokemon.GrassPokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new FirePokemon("charmander", 5);

        Pokemon bulbasaur = new GrassPokemon("bulbasaur" , 12);

        Pokemon squirtle = new WaterPokemon("squirtle", 5);

        Pokemon pikachu = new ElectricPokemon("pikachu" , 3);

        LearnNewAbility charmanderMoves = new LearnNewAbility(charmander);
        LearnNewAbility squirtleMoves = new LearnNewAbility(squirtle);
        LearnNewAbility bulbasaurMoves = new LearnNewAbility(bulbasaur);
        LearnNewAbility pikachuMoves = new LearnNewAbility(pikachu);


        Fight pokemonBattle = new Fight(charmander, bulbasaur);
        charmander.getStats().stats(charmander);
        bulbasaur.getStats().stats(bulbasaur);
        pokemonBattle.beginner();
        pokemonBattle.pokemonBattle();

        Fight pokemonBattle2 = new Fight(squirtle, pikachu);
        squirtle.getStats().stats(charmander);
        pikachu.getStats().stats(bulbasaur);
        pokemonBattle2.beginner();
        pokemonBattle2.pokemonBattle();
    }
}
