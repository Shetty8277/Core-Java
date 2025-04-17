package com.java.login.Runner;

import com.java.login.Internal.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library l1 = new Library("City Central", "Bangalore", "Public", "1985");
        Library l2 = new Library("Town Hall", "Bangalore", "Public", "1990");
        Library l3 = new Library("Elite Reads", "Mysore", "Private", "2000");

        boolean match = l1.equals(l2);
        boolean noMatch = l2.equals(l3);

        System.out.println("Library match: " + match);
        System.out.println("Library not match: " + noMatch);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
