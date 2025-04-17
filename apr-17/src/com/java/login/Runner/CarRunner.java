package com.java.login.Runner;

import com.java.login.Internal.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car c1 = new Car("X5", "BMW", "Black", "Petrol");
        Car c2 = new Car("Q7", "Audi", "Black", "Diesel");
        Car c3 = new Car("CX-5", "Mazda", "Red", "Petrol");

        boolean match = c1.equals(c2);
        boolean noMatch = c2.equals(c3);

        System.out.println("Car match: " + match);
        System.out.println("Car not match: " + noMatch);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
