package com.java.login.Runner;

import com.java.login.Internal.Pizza;

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Large", "Thin", "Pepperoni", 12.99);
        Pizza pizza2 = new Pizza("Large", "Thin", "Pepperoni", 12.99);
        Pizza pizza3 = new Pizza("Medium", "Stuffed", "Vegetarian", 15.99);

        boolean match = pizza1.equals(pizza2);
        boolean noMatch = pizza2.equals(pizza3);

        System.out.println("Pizza match: " + match);
        System.out.println("Pizza not match: " + noMatch);

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
