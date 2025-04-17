package com.java.login.Runner;

import com.java.login.Internal.DeskLamp;

public class DeskLampRunner {
    public static void main(String[] args) {
        DeskLamp lamp1 = new DeskLamp();
        lamp1.setBrand("Philips");
        lamp1.setColor("White");
        lamp1.setPrice(29.99);
        lamp1.setBrightness(800);

        DeskLamp lamp2 = new DeskLamp();
        lamp2.setBrand("Ikea");
        lamp2.setColor("Black");
        lamp2.setPrice(19.99);
        lamp2.setBrightness(600);

        DeskLamp lamp3 = new DeskLamp();
        lamp3.setBrand("Philips");
        lamp3.setColor("White");
        lamp3.setPrice(29.99);
        lamp3.setBrightness(800);

        boolean match = lamp1.equals(lamp3);
        boolean noMatch = lamp1.equals(lamp2);

        System.out.println("DeskLamp match: " + match);
        System.out.println("DeskLamp not match: " + noMatch);

        System.out.println(lamp1);
        System.out.println(lamp2);
        System.out.println(lamp3);
    }
}
