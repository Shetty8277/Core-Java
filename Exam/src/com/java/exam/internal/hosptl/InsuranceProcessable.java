package com.java.exam.internal.hosptl;

public interface InsuranceProcessable extends NurseManageable{

    void verifyInsurance();
    void processClaim();
    void contactProvider();
    void generateInsuranceReport();
    void updatePolicy();
    void rejectClaim();
    void approveClaim();
}
