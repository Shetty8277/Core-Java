package com.java.exam.internal.hosptl;

public interface PharmacyManageable extends Trackable{

    void checkStock();
    void dispenseMedicine();
    void addInventory();
    void removeExpired();
    void generateReport();
}
