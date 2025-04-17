package com.java.login.Internal;

import java.util.Objects;

public class College {
    private String name;
    private String location;
    private String university;
    private String accreditation;

    public College(String name, String location, String university, String accreditation) {
        this.name = name;
        this.location = location;
        this.university = university;
        this.accreditation = accreditation;
    }

    @Override
    public String toString() {
        return "College(Name: " + name + ", Location: " + location + ", University: " + university + ", Accreditation: " + accreditation + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof College) {
            College c = (College) obj;
            if (Objects.equals(this.location, c.location) && Objects.equals(this.university, c.university)) {
                System.out.println("College location and university match");
                return true;
            }
        }
        return false;
    }
}
