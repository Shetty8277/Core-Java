package com.java.login.Runner;

import com.java.login.Internal.Shoes;

public class ShoesRunner {
    public static void main(String[] args) {
        Shoes shoes1 = new Shoes("Nike", "Running", 10.5, 89.99);
        Shoes shoes2 = new Shoes("Adidas", "Casual", 9.5, 79.99);
        Shoes shoes3 = new Shoes("Nike", "Running", 10.5, 89.99);

        boolean match = shoes1.equals(shoes3);
        boolean noMatch = shoes1.equals(shoes2);

        System.out.println("Shoes match: " + match);
        System.out.println("Shoes not match: " + noMatch);

        System.out.println(shoes1);
        System.out.println(shoes2);
        System.out.println(shoes3);
    }
}
