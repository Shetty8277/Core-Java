package com.java.login.Runner;

import com.java.login.Internal.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch1 = new Watch("Apple", "Watch Series 6", true, 399.99);
        Watch watch2 = new Watch("Samsung", "Galaxy Watch 4", true, 249.99);
        Watch watch3 = new Watch("Apple", "Watch Series 6", true, 399.99);

        boolean match = watch1.equals(watch3);
        boolean noMatch = watch1.equals(watch2);

        System.out.println("Watch match: " + match);
        System.out.println("Watch not match: " + noMatch);

        System.out.println(watch1);
        System.out.println(watch2);
        System.out.println(watch3);
    }
}
