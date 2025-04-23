package com.java.exam.internal.hosptl;

public interface LabManageable extends Operable{
    void collectSample();
    void analyzeSample();
    void storeResults();
}
