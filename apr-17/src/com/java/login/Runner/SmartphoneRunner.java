package com.java.login.Runner;

import com.java.login.Internal.Smartphone;

public class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("Apple", "iPhone 12", "128GB", "Black");
        Smartphone phone2 = new Smartphone("Apple", "iPhone 12", "128GB", "Black");
        Smartphone phone3 = new Smartphone("Samsung", "Galaxy S21", "256GB", "Silver");

        boolean match = phone1.equals(phone2);
        boolean noMatch = phone2.equals(phone3);

        System.out.println("Smartphone match: " + match);
        System.out.println("Smartphone not match: " + noMatch);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
