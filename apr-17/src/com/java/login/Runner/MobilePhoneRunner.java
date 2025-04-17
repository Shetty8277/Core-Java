package com.java.login.Runner;

import com.java.login.Internal.MobilePhone;

public class MobilePhoneRunner {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone();
        phone1.setBrand("Apple");
        phone1.setModel("iPhone 12");
        phone1.setPrice(999.99);
        phone1.setColor("Black");

        MobilePhone phone2 = new MobilePhone();
        phone2.setBrand("Samsung");
        phone2.setModel("Galaxy S21");
        phone2.setPrice(799.99);
        phone2.setColor("Blue");

        MobilePhone phone3 = new MobilePhone();
        phone3.setBrand("Apple");
        phone3.setModel("iPhone 12");
        phone3.setPrice(999.99);
        phone3.setColor("Black");

        boolean match = phone1.equals(phone3);
        boolean noMatch = phone1.equals(phone2);

        System.out.println("MobilePhone match: " + match);
        System.out.println("MobilePhone not match: " + noMatch);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
