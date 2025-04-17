package com.java.login.Runner;

import com.java.login.Internal.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine wm1 = new WashingMachine();
        wm1.setBrand("Whirlpool");
        wm1.setLoadCapacity(7);
        wm1.setType("Front Load");
        wm1.setPrice(499.99);

        WashingMachine wm2 = new WashingMachine();
        wm2.setBrand("LG");
        wm2.setLoadCapacity(8);
        wm2.setType("Top Load");
        wm2.setPrice(599.99);

        WashingMachine wm3 = new WashingMachine();
        wm3.setBrand("Whirlpool");
        wm3.setLoadCapacity(7);
        wm3.setType("Front Load");
        wm3.setPrice(499.99);

        boolean match = wm1.equals(wm3);
        boolean noMatch = wm1.equals(wm2);

        System.out.println("WashingMachine match: " + match);
        System.out.println("WashingMachine not match: " + noMatch);

        System.out.println(wm1);
        System.out.println(wm2);
        System.out.println(wm3);
    }
}
