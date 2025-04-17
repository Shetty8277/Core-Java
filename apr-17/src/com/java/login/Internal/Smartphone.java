package com.java.login.Internal;

import java.util.Objects;

public class Smartphone {
    private String brand;
    private String model;
    private String storage;
    private String color;

    public Smartphone(String brand, String model, String storage, String color) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Smartphone(Brand: " + brand + ", Model: " + model + ", Storage: " + storage + ", Color: " + color + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Smartphone) {
            Smartphone phone = (Smartphone) obj;
            if (Objects.equals(this.model, phone.model)) {
                System.out.println("Smartphone model match");
                return true;
            }
        }
        return false;
    }
}
