package com.java.exam.internal.hosptl;

public interface AmbulanceTrackable extends BedManageable{

    void dispatchAmbulance();
    void trackAmbulance();
    void logTrip();
    void alertHospital();
    void receivePatient();
    void refuelAmbulance();
    void maintainVehicle();
}
