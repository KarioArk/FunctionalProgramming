package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdafied {

    private interface Incrementor {
        int increment(int x);
    }

    public int increment(int x) {
        return x + 1;
    }

    public int add(int x, int y) {
        return x + y;
    }

}
