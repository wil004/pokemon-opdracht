package Stats;

import Pokemon.Pokemon;

public class ExperienceCalculation {
  private Pokemon pokemon;

    public ExperienceCalculation(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void levelUp(Pokemon winningPokemon) {
      while (winningPokemon.getStats().getExperience() >= winningPokemon.getStats().nextLevelExperience()) {
       winningPokemon.setLevelUp();
    }
        if (winningPokemon.getStats().getLeveledUp()) {
            winningPokemon.setLevelUp();
            System.out.println(winningPokemon.getName() + " leveled up to " + winningPokemon.getStats().getLevel());
            winningPokemon.getStats().setLeveledUp();
        } else {
            System.out.println(winningPokemon.getName() + " will level up when xp is: " + winningPokemon.getStats().nextLevelExperience());
        }
    };

    public void gainExperience(Pokemon winningPokemon, Pokemon losingPokemon) {
        System.out.println(winningPokemon.getName() + " has a current xp of " + winningPokemon.getStats().getExperience());
        System.out.println(winningPokemon.getName() + " gained " + losingPokemon.getStats().getLevel() * 500 + " experience!");
        winningPokemon.getStats().setExperience(losingPokemon.getStats().getLevel() * 500);
        System.out.println(winningPokemon.getName() + " has a new total xp of " + winningPokemon.getStats().getExperience());
        levelUp(winningPokemon);
        System.out.println("---------------------------");
    }
}
