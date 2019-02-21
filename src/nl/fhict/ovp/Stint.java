package nl.fhict.ovp;

import java.util.ArrayList;

public class Stint {
    private static final int maxGewicht = 300; // maximale belasting van de stint
    private final ArrayList<Scholier> scholieren;

    public Stint() {
        this.scholieren = new ArrayList<>(); // lijst van scholieren in deze stint
    }

    public void addScholier(Scholier scholier) {
        if (canAddScholier()) {
            scholieren.add(scholier);
        }
    }

    private boolean canAddScholier() {
        return true;
    }

    public int getAantalScholieren() {
        return scholieren.size();
    }

    public int getCurrentLoad() {
        int gewicht = 0;

        for (Scholier scholier : scholieren) {
            gewicht += scholier.getGewicht();
        }

        return gewicht;
    }
}
