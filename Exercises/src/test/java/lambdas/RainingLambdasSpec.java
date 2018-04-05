package lambdas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RainingLambdasSpec {
    private final RainingLambdas lambdas = new RainingLambdas();

    @Test
    public void incrementBY1(){
        assertThat(lambdas.increment(5)).isEqualTo(6);
    }

    @Test
    public void addTwoNumbersReturnsTheSum(){
        assertThat(lambdas.add(5, 6)).isEqualTo(11);
    }
}
