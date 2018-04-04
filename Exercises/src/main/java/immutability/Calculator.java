package immutability;

public class Calculator {

    private int memory = 0;

    public int add(int a, int b){
        return a + b;
    }

    public int addWithMemory(int number) {
        memory += number;
        return memory;
    }
}
