package common.superheros;

import java.util.ArrayList;
import java.util.List;

public class SuperHero implements  Comparable<SuperHero> {

    private final String name;
    private final int strength;
    private final String realName;
    private final boolean fromEarth;
    private final List<String> associates;

    public SuperHero(String name, int strength) {
        this(name, strength, "", false, new ArrayList<>());
    }

    private SuperHero(String name, int strength, String realName, boolean fromEarth, List<String> associates) {
        this.name = name;
        this.strength = strength;
        this.realName = realName;
        this.fromEarth = fromEarth;
        this.associates = associates;
    }

    @Override
    public String toString() {
        return String.format("%s#%d", name, strength);
    }

    @Override
    public int compareTo(SuperHero opponent) {
        return this.strength - opponent.strength ;
    }

    public static class Builder {

        private String name;
        private int strength;
        private String realName;
        private boolean fromEarth;
        private List<String> associates = new ArrayList<>();

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder strength(int level) {
            this.strength = level;
            return this;
        }

        public Builder realName(String realName) {
            this.realName = realName;
            return this;
        }

        public Builder fromEarth(boolean isFromEarth) {
            this.fromEarth = isFromEarth;
            return this;
        }

        public Builder addAssociates(String associate) {
            this.associates.add(associate);
            return this;
        }

        public SuperHero build() {
            return new SuperHero(this.name,
                                this.strength,
                                this.realName,
                                this.fromEarth,
                                this.associates);
        }

    }
}
