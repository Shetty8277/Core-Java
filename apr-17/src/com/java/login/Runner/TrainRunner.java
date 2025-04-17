package com.java.login.Runner;

import com.java.login.Internal.Train;

public class TrainRunner {
    public static void main(String[] args) {
        Train t1 = new Train();
        t1.setTrainName("Intercity Express");
        t1.setTrainNo("12627");
        t1.setSource("Bangalore");
        t1.setDestination("Chennai");

        Train t2 = new Train();
        t2.setTrainName("Shatabdi");
        t2.setTrainNo("12007");
        t2.setSource("Bangalore");
        t2.setDestination("Chennai");

        Train t3 = new Train();
        t3.setTrainName("Rajdhani");
        t3.setTrainNo("22691");
        t3.setSource("Bangalore");
        t3.setDestination("Delhi");

        boolean match = t1.equals(t2);
        boolean noMatch = t2.equals(t3);

        System.out.println("Train match: " + match);
        System.out.println("Train not match: " + noMatch);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
