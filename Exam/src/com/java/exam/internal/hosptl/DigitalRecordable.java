package com.java.exam.internal.hosptl;

public interface DigitalRecordable extends AnalyticsManageable{

    void createRecord();
    void updateRecord();
    void deleteRecord();
    void fetchRecord();
    void archiveRecord();
    void shareRecord();
    void signRecord();
    void encryptRecord();
    void decryptRecord();
}
