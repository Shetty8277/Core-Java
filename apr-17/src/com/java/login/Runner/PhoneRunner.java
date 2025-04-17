package com.java.login.Runner;

import com.java.login.Internal.Phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "iPhone 13", 2021, 999.99);
        Phone phone2 = new Phone("Samsung", "Galaxy S21", 2021, 799.99);
        Phone phone3 = new Phone("Apple", "iPhone 13", 2021, 999.99);

        boolean match = phone1.equals(phone3);
        boolean noMatch = phone1.equals(phone2);

        System.out.println("Phone match: " + match);
        System.out.println("Phone not match: " + noMatch);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
