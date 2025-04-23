package com.java.exam.internal.hosptl;

public interface DataSyncable extends HospitalManageable{

    void fetchData();
    void pushUpdates();
    void logSync();
    void handleConflict();
    void clearCache();
    void retrySync();
    void verifyData();
    void notifyAdmin();
    void runDiagnostics();
}
