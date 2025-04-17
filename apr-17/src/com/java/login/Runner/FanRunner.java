package com.java.login.Runner;

import com.java.login.Internal.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setType("Ceiling");
        fan1.setPrice(50.00);
        fan1.setOscillating(true);
        fan1.setPower(80.0);

        Fan fan2 = new Fan();
        fan2.setType("Table");
        fan2.setPrice(30.00);
        fan2.setOscillating(false);
        fan2.setPower(50.0);

        Fan fan3 = new Fan();
        fan3.setType("Ceiling");
        fan3.setPrice(55.00);
        fan3.setOscillating(true);
        fan3.setPower(80.0);

        System.out.println(fan1.equals(fan2)); // false
        System.out.println(fan1.equals(fan3)); // true

        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);
    }
}
