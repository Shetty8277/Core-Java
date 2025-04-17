package com.java.login.Internal;

import java.util.Objects;

public class Laptop {
    private String model;
    private String brand;
    private String serialNumber;
    private String price;

    public Laptop(String model, String brand, String serialNumber, String price) {
        this.model = model;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop(Model: " + model + ", Brand: " + brand + ", Serial: " + serialNumber + ", Price: " + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Laptop) {
            Laptop l = (Laptop) obj;
            if (Objects.equals(this.serialNumber, l.serialNumber)) {
                System.out.println("Laptop serial number match");
                return true;
            }
        }
        return false;
    }
}
