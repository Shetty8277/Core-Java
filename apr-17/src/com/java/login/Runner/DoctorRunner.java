package com.java.login.Runner;

import com.java.login.Internal.Doctor;

public class DoctorRunner {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Shalini", "Cardiology", "Apollo", "DL1234");
        Doctor d2 = new Doctor("Dr. Kiran", "Cardiology", "Apollo", "DL5678");
        Doctor d3 = new Doctor("Dr. Ravi", "Neurology", "Fortis", "DL9999");

        boolean match = d1.equals(d2);
        boolean noMatch = d2.equals(d3);

        System.out.println("Doctor match: " + match);
        System.out.println("Doctor not match: " + noMatch);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
