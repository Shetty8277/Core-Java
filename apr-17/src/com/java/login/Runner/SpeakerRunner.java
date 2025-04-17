package com.java.login.Runner;

import com.java.login.Internal.Speaker;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker1 = new Speaker();
        speaker1.setBrand("JBL");
        speaker1.setWattage(20);
        speaker1.setBluetoothEnabled(true);
        speaker1.setPrice(2999.99);

        Speaker speaker2 = new Speaker();
        speaker2.setBrand("JBL");
        speaker2.setWattage(20);
        speaker2.setBluetoothEnabled(true);
        speaker2.setPrice(2999.99);

        Speaker speaker3 = new Speaker();
        speaker3.setBrand("Sony");
        speaker3.setWattage(30);
        speaker3.setBluetoothEnabled(false);
        speaker3.setPrice(3499.49);

        boolean match = speaker1.equals(speaker2);
        boolean noMatch = speaker2.equals(speaker3);

        System.out.println("Speaker match: " + match);
        System.out.println("Speaker not match: " + noMatch);

        System.out.println(speaker1);
        System.out.println(speaker2);
        System.out.println(speaker3);
    }
}
