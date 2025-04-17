package com.java.login.Internal;

import java.util.Objects;

public class Printer {
    private String brand;
    private String type;
    private String color;
    private double price;

    public Printer(String brand, String type, String color, double price) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Printer(Brand: " + brand + ", Type: " + type + ", Color: " + color + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Printer) {
            Printer p = (Printer) obj;
            if (Objects.equals(this.brand, p.brand)) {
                System.out.println("Printer brand match");
                return true;
            }
        }
        return false;
    }
}
