package com.java.login.Internal;

import java.util.Objects;

public class Flight {
    private String airline;
    private String flightNo;
    private String source;
    private String destination;

    public Flight(String airline, String flightNo, String source, String destination) {
        this.airline = airline;
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight(Airline: " + airline + ", Flight No: " + flightNo + ", Source: " + source + ", Destination: " + destination + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Flight) {
            Flight f = (Flight) obj;
            if (Objects.equals(this.source, f.source) && Objects.equals(this.destination, f.destination)) {
                System.out.println("Flight route matches");
                return true;
            }
        }
        return false;
    }
}
