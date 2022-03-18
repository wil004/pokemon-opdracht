package Ability.GrassAbilities;
        import Ability.GrassAbility;
        import Pokemon.Pokemon;


public class SpitSeed extends GrassAbility {
    private final int damage;
    private final String abilityName;

    public SpitSeed(Pokemon grassPokemon) {
        super(grassPokemon);
        int baseDamage = 30;
        this.damage = baseDamage + getDamageCalculation();
        this.abilityName = "SpitSeed";
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
        System.out.println("Spitting out a seed to the opponent");
    };
}