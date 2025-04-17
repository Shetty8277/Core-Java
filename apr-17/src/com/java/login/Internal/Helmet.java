package com.java.login.Internal;

import java.util.Objects;

public class Helmet {
    private String brand;
    private String color;
    private double weight;
    private boolean isISICertified;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setISICertified(boolean ISICertified) {
        isISICertified = ISICertified;
    }

    @Override
    public String toString() {
        return "Helmet(Brand: " + brand + ", Color: " + color + ", Weight: " + weight + "kg, ISI Certified: " + isISICertified + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Helmet) {
            Helmet other = (Helmet) obj;
            return Objects.equals(this.brand, other.brand) && Objects.equals(this.color, other.color);
        }
        return false;
    }
}
