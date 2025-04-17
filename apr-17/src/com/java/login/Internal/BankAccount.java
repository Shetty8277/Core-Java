package com.java.login.Internal;

import java.util.Objects;

public class BankAccount {
    private String accountHolder;
    private String accountType;
    private String accountNumber;
    private String balance;

    public BankAccount(String accountHolder, String accountType, String accountNumber, String balance) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount(AccountHolder: " + accountHolder + ", Type: " + accountType + ", AccountNumber: " + accountNumber + ", Balance: " + balance + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof BankAccount) {
            BankAccount b = (BankAccount) obj;
            if (Objects.equals(this.accountNumber, b.accountNumber)) {
                System.out.println("Bank account number match");
                return true;
            }
        }
        return false;
    }
}
