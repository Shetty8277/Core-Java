package com.java.login.Runner;

import com.java.login.Internal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer1 = new Printer("HP", "LaserJet", "Black", 150.0);
        Printer printer2 = new Printer("HP", "LaserJet", "Black", 150.0);
        Printer printer3 = new Printer("Canon", "PIXMA", "White", 120.0);

        boolean match = printer1.equals(printer2);
        boolean noMatch = printer2.equals(printer3);

        System.out.println("Printer match: " + match);
        System.out.println("Printer not match: " + noMatch);

        System.out.println(printer1);
        System.out.println(printer2);
        System.out.println(printer3);
    }
}
