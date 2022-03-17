package Person;

import Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String name;
    private String type;
    private List<Pokemon> pokemonList;


    public Person(String name) {
        this.name = name;
        pokemonList = new ArrayList<>();
    }

    public String getName() { return name; }

    public List<Pokemon> getPokemonList() { return pokemonList; }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }


    public abstract void typeUser();


    public void setPokemonType(String type) {
        this.type = type;
    };

    public String getPokemonType() {
        return type;
    };
}
