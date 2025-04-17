package com.java.login.Runner;

import com.java.login.Internal.Lamp;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp("Desk", 15, "White", true);
        Lamp lamp2 = new Lamp("Desk", 15, "White", true);
        Lamp lamp3 = new Lamp("Ceiling", 60, "Yellow", false);

        boolean match = lamp1.equals(lamp2);
        boolean noMatch = lamp2.equals(lamp3);

        System.out.println("Lamp match: " + match);
        System.out.println("Lamp not match: " + noMatch);

        System.out.println(lamp1);
        System.out.println(lamp2);
        System.out.println(lamp3);
    }
}
