package com.java.exam.internal.hosptl;

public interface Schedulable extends Notifiable{

    void createSchedule();
    void reschedule();
    void cancelAppointment();
    void sendReminder();
    void viewSchedule();
}
