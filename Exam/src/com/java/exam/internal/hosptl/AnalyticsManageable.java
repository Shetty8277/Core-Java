package com.java.exam.internal.hosptl;

public interface AnalyticsManageable extends PatientManageable{

    void generateStats();
    void logMetrics();
    void trackOutcomes();
    void visualizeTrends();
    void exportData();
    void importData();
    void anonymizeRecords();
    void notifyStakeholders();
    void refineModels();
}
