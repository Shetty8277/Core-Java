package com.java.login.Internal;

import java.util.Objects;

public class Hospital {
    private String name;
    private String location;
    private String type;
    private String registrationId;

    public Hospital(String name, String location, String type, String registrationId) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.registrationId = registrationId;
    }

    @Override
    public String toString() {
        return "Hospital(Name: " + name + ", Location: " + location + ", Type: " + type + ", Registration ID: " + registrationId + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Hospital) {
            Hospital h = (Hospital) obj;
            if (Objects.equals(this.location, h.location) && Objects.equals(this.type, h.type)) {
                System.out.println("Hospital location and type match");
                return true;
            }
        }
        return false;
    }
}
