package Ability.ElectricAbilities;
        import Ability.ElectricAbility;
        import Pokemon.Pokemon;

public class Spark extends ElectricAbility {
    private final int damage;
    private final String abilityName;

    public Spark(Pokemon electricPokemon) {
        super(electricPokemon);
        int baseDamage = 15;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "Spark";
    }

    @Override
    public int getDamage() {
        return damage;
    };

    @Override
    public String getAbilityName() {
        return abilityName;
    };

    @Override
    public void abilityDescription() {
        System.out.println("A simple electric spark hits the opponent!");
    };
}