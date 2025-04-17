package com.java.login.Runner;

import com.java.login.Internal.Flower;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Rose", "Red", 5, 3.99);
        Flower flower2 = new Flower("Rose", "Red", 5, 3.99);
        Flower flower3 = new Flower("Tulip", "Yellow", 6, 4.99);

        boolean match = flower1.equals(flower2);
        boolean noMatch = flower2.equals(flower3);

        System.out.println("Flower match: " + match);
        System.out.println("Flower not match: " + noMatch);

        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
    }
}
