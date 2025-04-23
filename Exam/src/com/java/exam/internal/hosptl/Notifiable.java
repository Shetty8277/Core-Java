package com.java.exam.internal.hosptl;

public interface Notifiable extends LabManageable{
    void sendAlert();
    void logNotification();
    void notifyDoctor();
}
