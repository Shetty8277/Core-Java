package com.java.login.Runner;

import com.java.login.Internal.Pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Parker", "Blue", 15.99, "Ballpoint");
        Pen pen2 = new Pen("Pilot", "Black", 10.99, "Gel");
        Pen pen3 = new Pen("Parker", "Blue", 15.99, "Ballpoint");

        boolean match = pen1.equals(pen3);
        boolean noMatch = pen1.equals(pen2);

        System.out.println("Pen match: " + match);
        System.out.println("Pen not match: " + noMatch);

        System.out.println(pen1);
        System.out.println(pen2);
        System.out.println(pen3);
    }
}
