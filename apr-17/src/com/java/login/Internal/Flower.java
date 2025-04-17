package com.java.login.Internal;

import java.util.Objects;

public class Flower {
    private String name;
    private String color;
    private int petals;
    private double price;

    public Flower(String name, String color, int petals, double price) {
        this.name = name;
        this.color = color;
        this.petals = petals;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower(Name: " + name + ", Color: " + color + ", Petals: " + petals + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Flower) {
            Flower flower = (Flower) obj;
            return Objects.equals(this.name, flower.name) && this.petals == flower.petals;
        }
        return false;
    }
}
