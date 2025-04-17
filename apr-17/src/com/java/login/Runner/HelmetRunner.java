package com.java.login.Runner;

import com.java.login.Internal.Helmet;

public class HelmetRunner {
    public static void main(String[] args) {
        Helmet helmet1 = new Helmet();
        helmet1.setBrand("Studds");
        helmet1.setColor("Black");
        helmet1.setWeight(1.2);
        helmet1.setISICertified(true);

        Helmet helmet2 = new Helmet();
        helmet2.setBrand("Studds");
        helmet2.setColor("Black");
        helmet2.setWeight(1.2);
        helmet2.setISICertified(true);

        Helmet helmet3 = new Helmet();
        helmet3.setBrand("Vega");
        helmet3.setColor("Red");
        helmet3.setWeight(1.4);
        helmet3.setISICertified(false);

        boolean match = helmet1.equals(helmet2);
        boolean noMatch = helmet2.equals(helmet3);

        System.out.println("Helmet match: " + match);
        System.out.println("Helmet not match: " + noMatch);

        System.out.println(helmet1);
        System.out.println(helmet2);
        System.out.println(helmet3);
    }
}
