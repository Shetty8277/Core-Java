package com.java.exam.internal.hosptl;

public interface Maintainable extends PharmacyManageable{

    void inspectEquipment();
    void performMaintenance();
    void logIssues();
    void requestParts();
    void shutdownDevice();
}
