package com.java.login.Runner;

import com.java.login.Internal.Bag;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag1 = new Bag("Backpack", "Leather", "Black", 1.5);
        Bag bag2 = new Bag("Backpack", "Leather", "Black", 1.5);
        Bag bag3 = new Bag("Tote", "Canvas", "Blue", 0.8);

        boolean match = bag1.equals(bag2);
        boolean noMatch = bag2.equals(bag3);

        System.out.println("Bag match: " + match);
        System.out.println("Bag not match: " + noMatch);

        System.out.println(bag1);
        System.out.println(bag2);
        System.out.println(bag3);
    }
}
