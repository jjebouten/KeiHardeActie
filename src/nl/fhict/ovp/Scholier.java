package nl.fhict.ovp;

import java.util.Random;

public class Scholier {
    private static final int minGewicht = 32;
    private static final int maxGewicht = 68;
    private int gewicht;

    public Scholier() {
        this.gewicht = getInitialRandomWeight();
    }

    private int getInitialRandomWeight() {
        Random rng = new Random();

        return rng.nextInt((maxGewicht - minGewicht) + 1) + minGewicht;
    }

    int getGewicht() {
        return gewicht;
    }
}
