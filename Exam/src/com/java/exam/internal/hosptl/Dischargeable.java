package com.java.exam.internal.hosptl;

public interface Dischargeable  extends Admittable{

    void prepareDischarge();
    void updateRecords();
    void notifyFamily();
}
