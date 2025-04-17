package com.java.login.Runner;

import com.java.login.Internal.Television;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television tv1 = new Television("Samsung", "55\"", "4K", "$800");
        Television tv2 = new Television("Samsung", "55\"", "4K", "$800");
        Television tv3 = new Television("LG", "65\"", "8K", "$1200");

        boolean match = tv1.equals(tv2);
        boolean noMatch = tv2.equals(tv3);

        System.out.println("Television match: " + match);
        System.out.println("Television not match: " + noMatch);

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
    }
}
