package com.java.login.Runner;

import com.java.login.Internal.College;

public class CollegeRunner {
    public static void main(String[] args) {
        College c1 = new College("NITK", "Surathkal", "NIT", "A++");
        College c2 = new College("NITC", "Calicut", "NIT", "A+");
        College c3 = new College("PESU", "Bangalore", "VTU", "A++");

        boolean match = c1.equals(c2);
        boolean noMatch = c2.equals(c3);

        System.out.println("College match: " + match);
        System.out.println("College not match: " + noMatch);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
