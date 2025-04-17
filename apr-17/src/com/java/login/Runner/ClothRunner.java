package com.java.login.Runner;

import com.java.login.Internal.Cloth;

public class ClothRunner {
    public static void main(String[] args) {
        Cloth cloth1 = new Cloth();
        cloth1.setType("Shirt");
        cloth1.setColor("Red");
        cloth1.setPrice(25.00);
        cloth1.setCotton(true);

        Cloth cloth2 = new Cloth();
        cloth2.setType("Pants");
        cloth2.setColor("Black");
        cloth2.setPrice(40.00);
        cloth2.setCotton(false);

        Cloth cloth3 = new Cloth();
        cloth3.setType("Shirt");
        cloth3.setColor("Red");
        cloth3.setPrice(30.00);
        cloth3.setCotton(true);

        System.out.println(cloth1.equals(cloth2)); // false
        System.out.println(cloth1.equals(cloth3)); // true

        System.out.println(cloth1);
        System.out.println(cloth2);
        System.out.println(cloth3);
    }
}
