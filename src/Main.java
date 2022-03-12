import Ability.LearnNewAbility;
import Fight.Fight;
import Pokemon.Pokemon;
import Pokemon.FirePokemon;
import Pokemon.WaterPokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new FirePokemon("charmander", 30);

        Pokemon squirtle = new WaterPokemon("squirtle", 30);

        LearnNewAbility learn = new LearnNewAbility(charmander);
        LearnNewAbility learn2 = new LearnNewAbility(squirtle);

        Fight pokemonBattle = new Fight(charmander, squirtle);

        pokemonBattle.stats();

        pokemonBattle.pokemonBattle();
    }
}
