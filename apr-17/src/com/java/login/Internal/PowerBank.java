package com.java.login.Internal;

import java.util.Objects;

public class PowerBank {
    private String brand;
    private int capacity;
    private boolean fastCharging;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFastCharging(boolean fastCharging) {
        this.fastCharging = fastCharging;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PowerBank(Brand: " + brand + ", Capacity: " + capacity + "mAh, Fast Charging: " + fastCharging + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof PowerBank) {
            PowerBank other = (PowerBank) obj;
            return Objects.equals(this.brand, other.brand) && this.capacity == other.capacity;
        }
        return false;
    }
}
