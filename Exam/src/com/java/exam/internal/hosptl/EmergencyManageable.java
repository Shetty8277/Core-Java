package com.java.exam.internal.hosptl;

public interface EmergencyManageable extends Consultable{

    void receiveEmergency();
    void alertER();
    void assignDoctor();
    void prepOR();
    void notifyRelatives();
    void logCase();
    void followUpCare();
}
