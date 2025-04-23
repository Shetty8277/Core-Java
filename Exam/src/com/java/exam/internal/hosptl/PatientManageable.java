package com.java.exam.internal.hosptl;

public interface PatientManageable extends DataSyncable{

    void registerPatient();
    void updateDetails();
    void assignDoctor();
    void manageFiles();
    void logSymptoms();
    void scheduleFollowUp();
    void linkInsurance();
    void notifyFamily();
    void printIDCard();
}
