package com.java.login.Internal;

import java.util.Objects;

public class Doctor {
    private String name;
    private String specialization;
    private String hospital;
    private String licenseId;

    public Doctor(String name, String specialization, String hospital, String licenseId) {
        this.name = name;
        this.specialization = specialization;
        this.hospital = hospital;
        this.licenseId = licenseId;
    }

    @Override
    public String toString() {
        return "Doctor(Name: " + name + ", Specialization: " + specialization + ", Hospital: " + hospital + ", License ID: " + licenseId + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Doctor) {
            Doctor d = (Doctor) obj;
            if (Objects.equals(this.specialization, d.specialization) && Objects.equals(this.hospital, d.hospital)) {
                System.out.println("Doctor specialization and hospital match");
                return true;
            }
        }
        return false;
    }
}
