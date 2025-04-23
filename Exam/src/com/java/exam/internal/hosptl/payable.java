package com.java.exam.internal.hosptl;

public interface payable extends HospitalBranch{

    void Bill();
    void processPayment();
    void printReceipt();
}
