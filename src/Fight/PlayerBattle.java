package Fight;

import Person.Person;
import Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PlayerBattle {
    private Person player1;
    private Person player2;
    private boolean pokemonsAlivePlayer1;
    private boolean pokemonsAlivePlayer2;
    private final List<Pokemon> alivePokemonPlayer1;
    private final List<Pokemon> alivePokemonPlayer2;

    public PlayerBattle(Person player1, Person player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.pokemonsAlivePlayer1 = true;
        this.pokemonsAlivePlayer2 = true;
        alivePokemonPlayer1 = new ArrayList<>();
        alivePokemonPlayer1.addAll(player1.getPokemonList());
        alivePokemonPlayer2 = new ArrayList<>();
        alivePokemonPlayer2.addAll(player2.getPokemonList());
    }


    public void playerBattlePvm() {
        while (pokemonsAlivePlayer1 && pokemonsAlivePlayer2) {
            if (alivePokemonPlayer1.size() == 0) {
                this.pokemonsAlivePlayer1 = false;
                System.out.println(player2.getName() + " won the battle!");
            } else if (alivePokemonPlayer2.size() == 0) {
                this.pokemonsAlivePlayer2 = false;
                System.out.println(player1.getName() + " won the battle!");
            }
            Fight pokemonBattle = new Pvm(alivePokemonPlayer1.get(0), alivePokemonPlayer2.get(0));
            System.out.println(player1.getName() + " " + alivePokemonPlayer1.get(0).getName() +
                    " lvl:" + alivePokemonPlayer1.get(0).getStats().getLevel() + "  health: " + alivePokemonPlayer1.get(0).getStats().getCurrentHp());
            System.out.println("|||||||||||||||||||");
            System.out.println(player2.getName() + " " + alivePokemonPlayer2.get(0).getName() +
                    " lvl:" + alivePokemonPlayer2.get(0).getStats().getLevel() +"  health: " + alivePokemonPlayer2.get(0).getStats().getCurrentHp());
            System.out.println("|||||||||||||||||||");
            alivePokemonPlayer1.get(0).getStats().getStats(alivePokemonPlayer1.get(0));
            alivePokemonPlayer2.get(0).getStats().getStats(alivePokemonPlayer2.get(0));
            pokemonBattle.pokemonBattle();

            if (!pokemonBattle.getPokemon1Alive()) {
                alivePokemonPlayer1.remove(0);
                if (alivePokemonPlayer1.size() == 0) {
                    this.pokemonsAlivePlayer1 = false;
                    System.out.println(player2.getName() + " won the battle!");
                    break;
                }
                pokemonBattle.setPokemon1Alive(true);
                System.out.println("------------------------------------------");
                System.out.println(player1.getName() + " chooses a new pokemon: " + alivePokemonPlayer1.get(0).getName());
                System.out.println(player1.getName() + " has " + alivePokemonPlayer1.size() + " pokemons left!");
                System.out.println("------------------------------------------");
            } else if (!pokemonBattle.getPokemon2Alive()) {
                alivePokemonPlayer2.remove(0);
                if (alivePokemonPlayer2.size() == 0) {
                    this.pokemonsAlivePlayer2 = false;
                    System.out.println(player1.getName() + " won the battle!");
                    break;
                }
                pokemonBattle.setPokemon2Alive(true);
                System.out.println("------------------------------------------");
                System.out.println(player2.getName() + " chooses a new pokemon: " + alivePokemonPlayer2.get(0).getName());
                System.out.println(player2.getName() + " has " + alivePokemonPlayer2.size() + " pokemons left!");
                System.out.println("------------------------------------------");
            }

        }
    }
}
