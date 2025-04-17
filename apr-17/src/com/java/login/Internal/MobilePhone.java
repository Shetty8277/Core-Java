package com.java.login.Internal;

import java.util.Objects;

public class MobilePhone {
    private String brand;
    private String model;
    private double price;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MobilePhone(Brand: " + brand + ", Model: " + model + ", Price: $" + price + ", Color: " + color + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof MobilePhone) {
            MobilePhone other = (MobilePhone) obj;
            return Objects.equals(this.brand, other.brand) && Objects.equals(this.model, other.model);
        }
        return false;
    }
}
