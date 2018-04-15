package common.superheros;

import java.util.ArrayList;
import java.util.List;

public class SuperHero {

    private final String name;
    private final int strength;
    private final String fightResult;

    private SuperHero(String name, int strength, String lastFightResult) {
        this.name = name;
        this.strength = strength;
        this.fightResult = lastFightResult;
    }

    public SuperHero(String name, int strength) {
        this(name, strength, "");
    }

    public String getName() {
        return name;
    }

    public SuperHero fight(SuperHero opponent) {
        if(opponent.strength > this.strength) {
            return new SuperHero(this.name, this.strength, "Lose");
        } else if(opponent.strength < this.strength) {
            return new SuperHero(this.name, this.strength + 2, "Win");
        }
        return new SuperHero(this.name, this.strength + 1, "Draw");
    }

    public String fightResult() {
        return this.fightResult;
    }

    public int currentStrength() {
        return this.strength;
    }

    // TODO: To be implemented
    public String fightHistory() {
        return "";
    }
}