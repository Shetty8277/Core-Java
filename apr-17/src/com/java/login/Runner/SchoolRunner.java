package com.java.login.Runner;

import com.java.login.Internal.School;

public class SchoolRunner {
    public static void main(String[] args) {
        School s1 = new School("Greenwood", "Chennai", "Mr. Kumar", "S123");
        School s2 = new School("Greenwood", "Chennai", "Mr. Kumar", "S123");
        School s3 = new School("Sunshine Academy", "Delhi", "Mr. Singh", "S124");

        boolean match = s1.equals(s2);
        boolean noMatch = s2.equals(s3);

        System.out.println("School match: " + match);
        System.out.println("School not match: " + noMatch);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
