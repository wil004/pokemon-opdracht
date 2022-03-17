package Person;

public class Player extends Person{

    public Player(String name) {
        super(name);
        setPokemonType("all");
    }

    @Override
    public void typeUser() {
        System.out.println("This is a player!");
    }

}
