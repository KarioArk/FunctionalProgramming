package immutability;

import common.superheros.SuperHero;
import org.junit.Ignore;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class SuperHeroSpec {

    /*
        Model a super hero with the following attributes
        1. Name
        2. Strength Level
     */
    // Outcome - Simple object creation with 2 params

    @Test
    public void ableToCreateSuperHeroObjectWithNameAndStrength() {
        assertThat(new SuperHero("Hulk", 200).toString()).isEqualTo("Hulk#200");
    }

    /*
        Model a super hero with the following attributes
        1. Name
        2. Strength Level
        3. Real Name
        4. Associates
        5. From Earth
     */
    // Outcome - More complex object using Builder

    @Test
    public void ableToCreateMoreComplexSuperHero() {
        SuperHero superHero = new SuperHero.Builder()
                                            .name("Hulk")
                                            .strength(200)
                                            .realName("Bruce Banner")
                                            .addAssociates("Black Widow")
                                            .addAssociates("Nick Fury")
                                            .fromEarth(true)
                                            .build();

        assertThat(superHero.toString()).isEqualTo("Hulk#200");
    }


    /*
        Make the super hero fight with another one. This leads to

        1. Win - If the strength is more than the opponent
        2. Lose - If the strength is less
        3. Draw - when the strengths are the same.
     */
    // Outcome - a comparison on win/ loss/ draw

    @Test
    public void ableToGetBackPositiveWhenWinsTheFight() {
        SuperHero hulk = new SuperHero("Hulk", 200);
        SuperHero thor = new SuperHero("Thor", 210);
        assertThat(thor.compareTo(hulk)).isPositive();
    }


    @Test
    public void ableToGetBackNegativeWhenWinsTheFight() {
        SuperHero hulk = new SuperHero("Hulk", 210);
        SuperHero thor = new SuperHero("Thor", 200);
        assertThat(thor.compareTo(hulk)).isNegative();
    }


    @Test
    public void ableToGetBackZeroWhenWinsTheFight() {
        SuperHero hulk = new SuperHero("Hulk", 200);
        SuperHero thor = new SuperHero("Thor", 200);
        assertThat(thor.compareTo(hulk)).isZero();
    }


    /*
        As an after math of the fight, if the super

        1. Wins - His strength increased by 2
        2. Draws - His strength increases by 1
        3. Loss - His strength remains the same.
     */
    // New object of Super hero with the increased power level

    /*
        Get the fight history of the hero which displays
        1. With whom the fight was
        2. What was the result
        3. What was the change in Strength level ( like increased from 2 to 4
     */
    // Store of all the history of the super hero which is nothing but the result from each fight

}
