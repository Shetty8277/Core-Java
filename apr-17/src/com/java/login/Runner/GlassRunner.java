package com.java.login.Runner;

import com.java.login.Internal.Glass;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass1 = new Glass();
        glass1.setMaterial("Glass");
        glass1.setPrice(5.00);
        glass1.setCapacity(0.25);
        glass1.setTumbler(true);

        Glass glass2 = new Glass();
        glass2.setMaterial("Plastic");
        glass2.setPrice(2.00);
        glass2.setCapacity(0.3);
        glass2.setTumbler(false);

        Glass glass3 = new Glass();
        glass3.setMaterial("Glass");
        glass3.setPrice(6.00);
        glass3.setCapacity(0.25);
        glass3.setTumbler(true);

        System.out.println(glass1.equals(glass2)); // false
        System.out.println(glass1.equals(glass3)); // true

        System.out.println(glass1);
        System.out.println(glass2);
        System.out.println(glass3);
    }
}
