package com.java.exam.internal.hosptl;

public interface NurseManageable extends AmbulanceTrackable{

    void assignShifts();
    void logAttendance();
    void handlePatients();
    void reportToDoctor();
    void assistInSurgery();
    void monitorEquipment();
    void trainNurses();
}
