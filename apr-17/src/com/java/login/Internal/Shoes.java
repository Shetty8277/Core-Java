package com.java.login.Internal;

import java.util.Objects;

public class Shoes {
    private String brand;
    private String type;
    private double size;
    private double price;

    public Shoes(String brand, String type, double size, double price) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoes(Brand: " + brand + ", Type: " + type + ", Size: " + size + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shoes) {
            Shoes shoes = (Shoes) obj;
            return Objects.equals(this.type, shoes.type) && this.size == shoes.size;
        }
        return false;
    }
}
