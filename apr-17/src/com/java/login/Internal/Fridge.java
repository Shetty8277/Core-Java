package com.java.login.Internal;

import java.util.Objects;

public class Fridge {
    private String brand;
    private double capacity;
    private boolean hasFreezer;
    private double price;

    public Fridge(String brand, double capacity, boolean hasFreezer, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fridge(Brand: " + brand + ", Capacity: " + capacity + "L, Freezer: " + hasFreezer + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fridge) {
            Fridge fridge = (Fridge) obj;
            return Objects.equals(this.brand, fridge.brand) && this.capacity == fridge.capacity;
        }
        return false;
    }
}
