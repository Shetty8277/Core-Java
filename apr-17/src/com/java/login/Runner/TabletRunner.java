package com.java.login.Runner;

import com.java.login.Internal.Tablet;

public class TabletRunner {
    public static void main(String[] args) {
        Tablet tablet1 = new Tablet("Apple", "iPad Pro", 128, 799.99);
        Tablet tablet2 = new Tablet("Samsung", "Galaxy Tab", 128, 649.99);
        Tablet tablet3 = new Tablet("Apple", "iPad Pro", 128, 799.99);

        boolean match = tablet1.equals(tablet3);
        boolean noMatch = tablet1.equals(tablet2);

        System.out.println("Tablet match: " + match);
        System.out.println("Tablet not match: " + noMatch);

        System.out.println(tablet1);
        System.out.println(tablet2);
        System.out.println(tablet3);
    }
}
