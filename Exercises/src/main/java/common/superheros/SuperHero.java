package common.superheros;

public class SuperHero {

    private final String name;
    private final int strength;


    public String getName() {
        return name;
    }

    public SuperHero(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }
}