package com.java.login.Runner;

import com.java.login.Internal.Bed;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed1 = new Bed();
        bed1.setSize("King");
        bed1.setMaterial("Wood");
        bed1.setPrice(500.00);
        bed1.setKingSize(true);

        Bed bed2 = new Bed();
        bed2.setSize("Queen");
        bed2.setMaterial("Metal");
        bed2.setPrice(350.00);
        bed2.setKingSize(false);

        Bed bed3 = new Bed();
        bed3.setSize("King");
        bed3.setMaterial("Wood");
        bed3.setPrice(550.00);
        bed3.setKingSize(true);

        System.out.println(bed1.equals(bed2)); // false
        System.out.println(bed1.equals(bed3)); // true

        System.out.println(bed1);
        System.out.println(bed2);
        System.out.println(bed3);
    }
}
