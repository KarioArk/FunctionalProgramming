package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class RainingLambdas {

    private interface Incrementor {
        int increment(int x);
    }

    // 1. Create an instance of Incrementor and use it in this place
    // 2. Replace them with lambda
    public int increment(int x) {
        return x + 1;
    }

    // 3. Create an adder similar to the incrementor and use it here
    // 4. Replace them with lambda
    public int add(int x, int y) {
        return x + y;
    }

}
