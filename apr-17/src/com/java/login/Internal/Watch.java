package com.java.login.Internal;

import java.util.Objects;

public class Watch {
    private String brand;
    private String model;
    private boolean isSmart;
    private double price;

    public Watch(String brand, String model, boolean isSmart, double price) {
        this.brand = brand;
        this.model = model;
        this.isSmart = isSmart;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch(Brand: " + brand + ", Model: " + model + ", Smart: " + isSmart + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Watch) {
            Watch watch = (Watch) obj;
            return Objects.equals(this.model, watch.model) && this.isSmart == watch.isSmart;
        }
        return false;
    }
}
