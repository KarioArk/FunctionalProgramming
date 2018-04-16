package immutability;

import common.superheros.SuperHero;
import org.junit.Ignore;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class SuperHeroSpec {

    /**
     * ONLY IMMUTABLE OBJECTS
     */

    // TODO: This need not be a separate spec since we already have a SuperHero class?
    /*
        Model a super hero with the following attributes
        1. Name
        2. Strength Level
     */
    // Outcome - Simple object creation with 2 params
    @Test
    public void shouldCreateSuperHeroWithGivenNameAndStrength() {
        assertThat(new SuperHero("Hulk", 86)).isNotNull();
    }

    /*
        Make the super hero fight with another one. This leads to

        1. Win - If the strength is more than the opponent
        2. Lose - If the strength is less
        3. Draw - when the strengths are the same.
     */
    // Outcome - a comparison on win/ loss/ draw
    @Test
    public void shouldFightAnotherSuperHeroAndAssertTheResult() {
        SuperHero hulk = new SuperHero("Hulk", 86);
        SuperHero thor = new SuperHero("Thor", 88);
        SuperHero aquaMan = new SuperHero("Aquaman", 86);
        assertThat(thor.fight(hulk).fightResult()).isEqualTo("Win");
        assertThat(hulk.fight(thor).fightResult()).isEqualTo("Lose");
        assertThat(aquaMan.fight(hulk).fightResult()).isEqualTo("Draw");
    }

    /*
        As an after math of the fight, if the super

        1. Wins - His strength increased by 2
        2. Draws - His strength increases by 1
        3. Loss - His strength remains the same.
     */
    // New object of Super hero with the increased power level
    @Test
    public void shouldFightAnotherSuperHeroAndAssertTheStrengthAfter() {
        SuperHero hulk = new SuperHero("Hulk", 86);
        SuperHero thor = new SuperHero("Thor", 88);
        SuperHero aquaMan = new SuperHero("Aquaman", 86);
        assertThat(thor.fight(hulk).currentStrength()).isEqualTo(90);
        assertThat(hulk.fight(thor).currentStrength()).isEqualTo(86);
        assertThat(aquaMan.fight(hulk).currentStrength()).isEqualTo(86);
    }

    // TODO: To be implemented
    /*
        Get the fight history of the hero which displays
        1. With whom the fight was
        2. What was the result
        3. What was the change in Strength level ( like increased from 2 to 4
     */
    // Store of all the history of the super hero which is nothing but the result from each fight
    @Test
    public void shouldFightAnotherSuperHeroesAndAssertTheHistoryOfFights() {
        SuperHero hulk = new SuperHero("Hulk", 86);
        SuperHero thor = new SuperHero("Thor", 88);
        SuperHero aquaMan = new SuperHero("Aquaman", 86);
        assertThat(thor.fight(hulk).fight(aquaMan).fightHistory()).isEqualTo("Won against Hulk and strength changed from 88 to 90, " +
                "Won against Aquaman and strength changed from 90 to 92,");
    }
}
