package com.java.login.Internal;

import java.util.Objects;

public class Library {
    private String name;
    private String location;
    private String type;
    private String establishedYear;

    public Library(String name, String location, String type, String establishedYear) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.establishedYear = establishedYear;
    }

    @Override
    public String toString() {
        return "Library(Name: " + name + ", Location: " + location + ", Type: " + type + ", Established: " + establishedYear + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Library) {
            Library l = (Library) obj;
            if (Objects.equals(this.location, l.location) && Objects.equals(this.type, l.type)) {
                System.out.println("Library location and type match");
                return true;
            }
        }
        return false;
    }
}
