package com.java.login.Runner;

import com.java.login.Internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("XPS 13", "Dell", "SN1234", "$1500");
        Laptop l2 = new Laptop("XPS 13", "Dell", "SN1234", "$1500");
        Laptop l3 = new Laptop("MacBook Pro", "Apple", "SN1235", "$2000");

        boolean match = l1.equals(l2);
        boolean noMatch = l2.equals(l3);

        System.out.println("Laptop match: " + match);
        System.out.println("Laptop not match: " + noMatch);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
