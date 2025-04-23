package com.java.exam.internal.hosptl;

public interface Operable extends Dischargeable {

    void setupSurgery();
    void performSurgery();
    void sterilizeEquipment();
}
