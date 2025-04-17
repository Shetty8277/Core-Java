package com.java.login.Internal;

import java.util.Objects;

public class Car {
    private String model;
    private String brand;
    private String color;
    private String engineType;

    public Car(String model, String brand, String color, String engineType) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car(Model: " + model + ", Brand: " + brand + ", Color: " + color + ", Engine Type: " + engineType + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            Car c = (Car) obj;
            if (Objects.equals(this.brand, c.brand) && Objects.equals(this.color, c.color)) {
                System.out.println("Car brand and color match");
                return true;
            }
        }
        return false;
    }
}
