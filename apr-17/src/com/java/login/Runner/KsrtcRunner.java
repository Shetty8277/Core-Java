package com.java.login.Runner;

import com.java.login.Internal.Ksrtc;

public class KsrtcRunner {
    public static void main(String[] args) {
        Ksrtc ksrtc = new Ksrtc("Harsha Kumari","Chikmagalur","420","Benagaluru");
        Ksrtc ksrtc1 = new Ksrtc("Ujji Baba","Chikmagalur","420","Dantrmukki");
        Ksrtc ksrtc2 = new Ksrtc("Akash Gudde","Chikmagalur","420","Benagaluru");


        boolean match = ksrtc.equals(ksrtc2);
        System.out.println("The source and Destination is Matched "+match);

        boolean nomatch = ksrtc.equals(ksrtc1);
        System.out.println("he source and Destination is Matched "+nomatch);

        System.out.println(ksrtc);
        System.out.println(ksrtc1);
        System.out.println(ksrtc2);


    }
}
