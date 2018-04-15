package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionTypes {

    public void greet(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("Hello");
        }
    }
}
