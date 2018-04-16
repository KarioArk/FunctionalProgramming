package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlowingWithStreams {

    public List<Integer> firstNaturals(int howMany) {
        return new ArrayList<>();
    }

    public void random(int howMany) {
    }

    public List<List<Integer>> pythoGoreans(int howMany) {
        return null;
    }

    public void expensiveOp() {
        timer(Arrays.asList(1,2,3,4,5,6).stream());
    }

    private void timer(Stream<Integer> stream) {
        long startTime = System.nanoTime();
        stream.map(x->expensiveSquare(x)).collect(Collectors.toList());
        long timetaken = System.nanoTime()-startTime;
        System.out.println("Time taken "+timetaken/1000 + " nano seconds");
    }

    private int expensiveSquare(int x){
        try{
            Thread.sleep(x*100);
        } catch (Exception e){ }
        int square = x*x;
        System.out.println("Square called. Result:"+square);
        return square;
    }
}
