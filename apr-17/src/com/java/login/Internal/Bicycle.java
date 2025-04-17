package com.java.login.Internal;

import java.util.Objects;

public class Bicycle {
    private String brand;
    private String type;
    private int gearCount;
    private double price;

    public Bicycle(String brand, String type, int gearCount, double price) {
        this.brand = brand;
        this.type = type;
        this.gearCount = gearCount;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bicycle(Brand: " + brand + ", Type: " + type + ", Gear Count: " + gearCount + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bicycle) {
            Bicycle b = (Bicycle) obj;
            if (Objects.equals(this.brand, b.brand)) {
                System.out.println("Bicycle brand match");
                return true;
            }
        }
        return false;
    }
}
