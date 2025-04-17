package com.java.login.Internal;

import java.util.Objects;

public class Theatre {
    private String name;
    private String location;
    private String screenType;
    private String capacity;

    public Theatre(String name, String location, String screenType, String capacity) {
        this.name = name;
        this.location = location;
        this.screenType = screenType;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Theatre(Name: " + name + ", Location: " + location + ", Screen Type: " + screenType + ", Capacity: " + capacity + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Theatre) {
            Theatre t = (Theatre) obj;
            if (Objects.equals(this.location, t.location) && Objects.equals(this.screenType, t.screenType)) {
                System.out.println("Theatre location and screen type match");
                return true;
            }
        }
        return false;
    }
}
