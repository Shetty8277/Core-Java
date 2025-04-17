package com.java.login.Runner;

import com.java.login.Internal.Fridge;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge fridge1 = new Fridge("Samsung", 300.0, true, 35000.0);
        Fridge fridge2 = new Fridge("Samsung", 300.0, false, 33000.0);
        Fridge fridge3 = new Fridge("LG", 260.0, true, 28000.0);

        boolean match = fridge1.equals(fridge2);
        boolean noMatch = fridge1.equals(fridge3);

        System.out.println("Fridge match: " + match);
        System.out.println("Fridge not match: " + noMatch);

        System.out.println(fridge1);
        System.out.println(fridge2);
        System.out.println(fridge3);
    }
}
