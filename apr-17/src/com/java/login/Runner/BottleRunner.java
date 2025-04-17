package com.java.login.Runner;

import com.java.login.Internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("1 liter","20","Black","Plastic");
        Bottle bottle1 = new Bottle("2 liter","30","Transparent","plastic");
        Bottle bottle2 = new Bottle("1 liter","20","Black","Plastic");

        boolean match =bottle.equals(bottle2);
        System.out.println("The bottle is matched "+match);

        boolean nomatch = bottle1.equals(bottle2);
        System.out.println("he bottle is matched " +nomatch);

        System.out.println(bottle);
        System.out.println(bottle1);
        System.out.println(bottle2);
    }
}
