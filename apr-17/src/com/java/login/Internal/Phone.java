package com.java.login.Internal;

import java.util.Objects;

public class Phone {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Phone(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone(Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Phone) {
            Phone phone = (Phone) obj;
            return Objects.equals(this.model, phone.model) && this.year == phone.year;
        }
        return false;
    }
}
