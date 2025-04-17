package com.java.login.Runner;

import com.java.login.Internal.Flight;

public class FlightRunner {
    public static void main(String[] args) {
        Flight f1 = new Flight("IndiGo", "6E123", "Bangalore", "Hyderabad");
        Flight f2 = new Flight("Air India", "AI456", "Bangalore", "Hyderabad");
        Flight f3 = new Flight("SpiceJet", "SJ789", "Bangalore", "Mumbai");

        boolean match = f1.equals(f2);
        boolean noMatch = f2.equals(f3);

        System.out.println("Flight match: " + match);
        System.out.println("Flight not match: " + noMatch);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
