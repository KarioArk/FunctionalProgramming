package higherorder;

import java.util.function.Function;

public class HigherOrders {


    public static final Function<Integer, Integer> sigma = x -> {
        if(x == 0)
            return 0;

        return x + HigherOrders.sigma.apply(x-1);
    };
}
