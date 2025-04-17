package com.java.login.Internal;

import java.util.Objects;

public class Lamp {
    private String type;
    private int wattage;
    private String color;
    private boolean isLED;

    public Lamp(String type, int wattage, String color, boolean isLED) {
        this.type = type;
        this.wattage = wattage;
        this.color = color;
        this.isLED = isLED;
    }

    @Override
    public String toString() {
        return "Lamp(Type: " + type + ", Wattage: " + wattage + "W, Color: " + color + ", LED: " + isLED + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lamp) {
            Lamp l = (Lamp) obj;
            if (Objects.equals(this.type, l.type)) {
                System.out.println("Lamp type match");
                return true;
            }
        }
        return false;
    }
}
