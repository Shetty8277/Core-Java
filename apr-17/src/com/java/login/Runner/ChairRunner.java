package com.java.login.Runner;

import com.java.login.Internal.Chair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Wood", "Brown", true, 59.99);
        Chair chair2 = new Chair("Plastic", "Black", false, 39.99);
        Chair chair3 = new Chair("Wood", "Brown", true, 59.99);

        boolean match = chair1.equals(chair3);
        boolean noMatch = chair1.equals(chair2);

        System.out.println("Chair match: " + match);
        System.out.println("Chair not match: " + noMatch);

        System.out.println(chair1);
        System.out.println(chair2);
        System.out.println(chair3);
    }
}
