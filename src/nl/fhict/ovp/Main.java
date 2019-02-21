package nl.fhict.ovp;

import java.util.ArrayList;

public class Main {
    private static final int aantalScholieren = 118;
    private static final ArrayList<Stint> stints = new ArrayList<>();
    private static int stintNumber = 0;


    public static void main(String[] args) {

        ArrayList<Scholier> scholierenList = new ArrayList<>();

        for (int i = 0; i < aantalScholieren; i++) {
            Scholier scholier = new Scholier();
            scholierenList.add(scholier);
        }

        Stint stint = new Stint();

        for (int i = 0; i < scholierenList.size(); i++) {

            if (stint.getCurrentLoad() <= 300) {
                if ((stint.getCurrentLoad() + scholierenList.get(i).getGewicht()) < 300) {
                    stint.addScholier(scholierenList.get(i));

                } else {
                    stints.add(stint);
                   stint = new Stint();
                }
            }
        }


        System.out.println("Aantal stints voor deze reis: " + stints.size());
        for (int i = 0; i < stints.size(); i++) {
            System.out.println("Stint " + i +" Heeft het volgende aantal scholieren "+ stints.get(i).getAantalScholieren() + " Met het gewicht van " + stints.get(i).getCurrentLoad());
        }

    }
}
