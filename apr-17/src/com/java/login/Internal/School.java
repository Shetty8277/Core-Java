package com.java.login.Internal;

import java.util.Objects;

public class School {
    private String name;
    private String location;
    private String principal;
    private String schoolId;

    public School(String name, String location, String principal, String schoolId) {
        this.name = name;
        this.location = location;
        this.principal = principal;
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        return "School(Name: " + name + ", Location: " + location + ", Principal: " + principal + ", School ID: " + schoolId + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof School) {
            School s = (School) obj;
            if (Objects.equals(this.name, s.name) && Objects.equals(this.schoolId, s.schoolId)) {
                System.out.println("School name and ID match");
                return true;
            }
        }
        return false;
    }
}
