package com.java.login.Internal;

import java.util.Objects;

public class WashingMachine {
    private String brand;
    private double loadCapacity;
    private String type;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WashingMachine(Brand: " + brand + ", Load Capacity: " + loadCapacity + " kg, Type: " + type + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WashingMachine) {
            WashingMachine other = (WashingMachine) obj;
            return Objects.equals(this.brand, other.brand) && this.loadCapacity == other.loadCapacity;
        }
        return false;
    }
}
