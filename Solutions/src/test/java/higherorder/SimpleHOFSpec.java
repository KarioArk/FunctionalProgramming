package higherorder;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SimpleHOFSpec {

    //Implement Sigma
    @Test
    public void ableToCalculateSigma(){
        assertThat(HigherOrders.sigma.apply(5)).isEqualTo(15);
    }


    /*
    Housing Rent Calculator is based on Size in SqFt.
    It was noticed that it was linear in nature. But the pricing graph varies between
    different cities. Example as shown below.

    Chennai - 15X + 500
    Benguluru - 12X + 200
    Delhi -  30X - 1000
    Mumbai -  30X+ 300

    Given the city name and the SqFt measurement, I want to know the Rent.
   */



    /*
        Monthly Grocery spend is again based on the city and number of people in the house.
        The Forumla for each of those are as below.

        Chennai - 1000X + 200
        Benguluru - 1200X - 200
        Delhi -  1500X - 1000
        Mumbai -  1100X + 300

        Given the city and the number of people, I want to find the Grocery Expense
     */



    /*
        Given the city, housing in sqft and number of people
        Find cost of living.

        Cost of Living  = Rent + Grocery

     */


}
