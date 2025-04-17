package com.java.login.Runner;

import com.java.login.Internal.BankAccount;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("John Doe", "Savings", "A123", "$5000");
        BankAccount b2 = new BankAccount("John Doe", "Savings", "A123", "$5000");
        BankAccount b3 = new BankAccount("Jane Smith", "Checking", "A124", "$2000");

        boolean match = b1.equals(b2);
        boolean noMatch = b2.equals(b3);

        System.out.println("Bank Account match: " + match);
        System.out.println("Bank Account not match: " + noMatch);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
