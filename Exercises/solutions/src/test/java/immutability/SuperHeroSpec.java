package immutability;

public class SuperHeroSpec {

    /**
     * ONLY IMMUTABLE OBJECTS
     */

    /*
        Model a super hero with the following attributes
        1. Name
        2. Strength Level
     */
    // Outcome - Simple object creation with 2 params

    /*
        Make the super hero fight with another one. This leads to

        1. Win - If the strength is more than the opponent
        2. Lose - If the strength is less
        3. Draw - when the strengths are the same.
     */
    // Outcome - a comparison on win/ loss/ draw

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
