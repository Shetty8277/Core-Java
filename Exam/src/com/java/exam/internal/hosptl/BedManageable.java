package com.java.exam.internal.hosptl;

public interface BedManageable extends EmergencyManageable{

    void assignBed();
    void releaseBed();
    void updateBedStatus();
    void sanitizeBed();
    void logBedUsage();
    void viewBedOccupancy();
    void notifyWard();
}
