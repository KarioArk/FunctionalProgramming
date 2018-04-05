package immutability;

import immutability.Calculator;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorSpec {

    private Calculator calculator = new Calculator();


    @Test
    public void addTwoNumbersReturnsTheSum(){
        assertThat(calculator.add(3, 4)).isEqualTo(7);
        assertThat(calculator.add(9, 10)).isEqualTo(19);
        assertThat(calculator.add(3, 4)).isEqualTo(7);
        assertThat(calculator.add(2, 3)).isEqualTo(5);
    }

    @Test
    public void ableToAddTwoNumbersWithMemory() {
        assertThat(calculator.addWithMemory(2)).isEqualTo(2);
        assertThat(calculator.addWithMemory(5)).isEqualTo(7);
        assertThat(calculator.addWithMemory(7)).isEqualTo(14);
        assertThat(calculator.addWithMemory(2)).isEqualTo(16);
    }


    public void ableToAddTwoNumbersWithMemoryUsingImmutableObjects() {
        
    }
}
