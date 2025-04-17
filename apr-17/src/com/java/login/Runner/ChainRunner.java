package com.java.login.Runner;

import com.java.login.Internal.Chain;

public class ChainRunner {
    public static void main(String[] args) {
        Chain chain1 = new Chain();
        chain1.setMaterial("Gold");
        chain1.setLength(1.5);
        chain1.setPrice(200.00);
        chain1.setGold(true);

        Chain chain2 = new Chain();
        chain2.setMaterial("Silver");
        chain2.setLength(1.0);
        chain2.setPrice(100.00);
        chain2.setGold(false);

        Chain chain3 = new Chain();
        chain3.setMaterial("Gold");
        chain3.setLength(1.5);
        chain3.setPrice(220.00);
        chain3.setGold(true);

        System.out.println(chain1.equals(chain2)); // false
        System.out.println(chain1.equals(chain3)); // true

        System.out.println(chain1);
        System.out.println(chain2);
        System.out.println(chain3);
    }
}
