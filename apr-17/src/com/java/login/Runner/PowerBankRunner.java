package com.java.login.Runner;

import com.java.login.Internal.PowerBank;

public class PowerBankRunner {
    public static void main(String[] args) {
        PowerBank pb1 = new PowerBank();
        pb1.setBrand("Mi");
        pb1.setCapacity(10000);
        pb1.setFastCharging(true);
        pb1.setPrice(1299.0);

        PowerBank pb2 = new PowerBank();
        pb2.setBrand("Mi");
        pb2.setCapacity(10000);
        pb2.setFastCharging(true);
        pb2.setPrice(1399.0);

        PowerBank pb3 = new PowerBank();
        pb3.setBrand("Realme");
        pb3.setCapacity(20000);
        pb3.setFastCharging(false);
        pb3.setPrice(1599.0);

        boolean match = pb1.equals(pb2);
        boolean noMatch = pb2.equals(pb3);

        System.out.println("PowerBank match: " + match);
        System.out.println("PowerBank not match: " + noMatch);

        System.out.println(pb1);
        System.out.println(pb2);
        System.out.println(pb3);
    }
}
