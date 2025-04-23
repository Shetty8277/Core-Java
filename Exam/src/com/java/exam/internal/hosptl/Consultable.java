package com.java.exam.internal.hosptl;

public interface Consultable extends Maintainable{

    void scheduleConsultation();
    void consultPatient();
    void logConsultation();
    void updateTreatment();
    void followUp();

}
