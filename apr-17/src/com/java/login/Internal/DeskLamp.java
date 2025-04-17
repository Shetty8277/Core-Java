package com.java.login.Internal;

import java.util.Objects;

public class DeskLamp {
    private String brand;
    private String color;
    private double price;
    private double brightness;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "DeskLamp(Brand: " + brand + ", Color: " + color + ", Price: $" + price + ", Brightness: " + brightness + " lumens)";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof DeskLamp) {
            DeskLamp other = (DeskLamp) obj;
            return Objects.equals(this.brand, other.brand) && this.brightness == other.brightness;
        }
        return false;
    }
}
