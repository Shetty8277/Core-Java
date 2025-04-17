package com.java.login.Runner;

import com.java.login.Internal.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("Trek", "Mountain", 21, 450.0);
        Bicycle bicycle2 = new Bicycle("Trek", "Mountain", 21, 450.0);
        Bicycle bicycle3 = new Bicycle("Giant", "Road", 18, 350.0);

        boolean match = bicycle1.equals(bicycle2);
        boolean noMatch = bicycle2.equals(bicycle3);

        System.out.println("Bicycle match: " + match);
        System.out.println("Bicycle not match: " + noMatch);

        System.out.println(bicycle1);
        System.out.println(bicycle2);
        System.out.println(bicycle3);
    }
}
