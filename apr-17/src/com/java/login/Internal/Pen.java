package com.java.login.Internal;

import java.util.Objects;

public class Pen {
    private String brand;
    private String color;
    private double price;
    private String type;

    public Pen(String brand, String color, double price, String type) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pen(Brand: " + brand + ", Color: " + color + ", Price: $" + price + ", Type: " + type + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pen) {
            Pen pen = (Pen) obj;
            return Objects.equals(this.brand, pen.brand) && Objects.equals(this.color, pen.color);
        }
        return false;
    }
}
