package com.java.login.Internal;

import java.util.Objects;

public class Train {
    private String trainName;
    private String trainNo;
    private String source;
    private String destination;

    public Train() {}

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Train(Name: " + trainName + ", No: " + trainNo + ", Source: " + source + ", Destination: " + destination + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Train) {
            Train t = (Train) obj;
            if (Objects.equals(this.source, t.source) && Objects.equals(this.destination, t.destination)) {
                System.out.println("Train route matches");
                return true;
            }
        }
        return false;
    }
}
