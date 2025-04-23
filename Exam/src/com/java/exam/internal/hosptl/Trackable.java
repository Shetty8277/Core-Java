package com.java.exam.internal.hosptl;

public interface Trackable extends Schedulable{

    void trackVitals();
    void monitorMovement();
    void logChanges();
    void alertNurse();
    void updateDashboard();
}
