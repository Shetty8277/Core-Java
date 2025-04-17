package com.java.login.Runner;

import com.java.login.Internal.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        Theatre t1 = new Theatre("PVR Cinemas", "Bangalore", "IMAX", "300");
        Theatre t2 = new Theatre("INOX", "Bangalore", "IMAX", "250");
        Theatre t3 = new Theatre("Lakshmi Theatre", "Mysore", "2D", "400");

        boolean match = t1.equals(t2);
        boolean noMatch = t2.equals(t3);

        System.out.println("Theatre match: " + match);
        System.out.println("Theatre not match: " + noMatch);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
