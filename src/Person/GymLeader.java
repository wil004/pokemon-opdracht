package Person;

public class GymLeader extends Person{

    public GymLeader(String name, String type) {
        super(name);
        setPokemonType(type);
    }

    @Override
    public void typeUser() {
        System.out.println("This is a gym leader!");
    }

}
