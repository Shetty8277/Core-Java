package com.java.login.Runner;

import com.java.login.Internal.Product;

public class ProductRunner {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", "Electronics", "P123", 1500.00);
        Product p2 = new Product("Laptop", "Electronics", "P123", 1500.00);
        Product p3 = new Product("Smartphone", "Electronics", "P124", 700.00);

        boolean match = p1.equals(p2);
        boolean noMatch = p2.equals(p3);

        System.out.println("Product match: " + match);
        System.out.println("Product not match: " + noMatch);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
