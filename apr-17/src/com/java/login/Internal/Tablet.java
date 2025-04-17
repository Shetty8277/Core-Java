package com.java.login.Internal;

import java.util.Objects;

public class Tablet {
    private String brand;
    private String model;
    private int storage;
    private double price;

    public Tablet(String brand, String model, int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tablet(Brand: " + brand + ", Model: " + model + ", Storage: " + storage + "GB, Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tablet) {
            Tablet tablet = (Tablet) obj;
            return Objects.equals(this.brand, tablet.brand) && this.storage == tablet.storage;
        }
        return false;
    }
}
