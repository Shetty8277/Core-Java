package com.HundredExample.assignment.internal;

import javax.naming.Name;

public class Account {
    private String Name;
    private int balance;

    public Account()  {
        System.out.println("No-args constructor running.....");
    }

    public Account(String name, int balance) {
        this.Name = name;
        this.balance = balance;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountHolder=" + Name + "\"" + ", balance=" + balance + "}" ;
    }
}
