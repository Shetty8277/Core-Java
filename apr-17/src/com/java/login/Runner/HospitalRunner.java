package com.java.login.Runner;

import com.java.login.Internal.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Narayana Health", "Bangalore", "Multi-specialty", "H001");
        Hospital h2 = new Hospital("Manipal Hospital", "Bangalore", "Multi-specialty", "H002");
        Hospital h3 = new Hospital("Unity Care", "Hubli", "General", "H003");

        boolean match = h1.equals(h2);
        boolean noMatch = h2.equals(h3);

        System.out.println("Hospital match: " + match);
        System.out.println("Hospital not match: " + noMatch);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
