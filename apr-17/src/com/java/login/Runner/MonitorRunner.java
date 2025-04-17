package com.java.login.Runner;

import com.java.login.Internal.Monitor;

public class MonitorRunner {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("Dell", 27.0, "4K", true);
        Monitor monitor2 = new Monitor("Dell", 27.0, "4K", true);
        Monitor monitor3 = new Monitor("Samsung", 32.0, "1080p", false);

        boolean match = monitor1.equals(monitor2);
        boolean noMatch = monitor2.equals(monitor3);

        System.out.println("Monitor match: " + match);
        System.out.println("Monitor not match: " + noMatch);

        System.out.println(monitor1);
        System.out.println(monitor2);
        System.out.println(monitor3);
    }
}
