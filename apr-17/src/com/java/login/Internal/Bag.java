package com.java.login.Internal;

import java.util.Objects;

public class Bag {
    private String type;
    private String material;
    private String color;
    private double weight;

    public Bag(String type, String material, String color, double weight) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bag(Type: " + type + ", Material: " + material + ", Color: " + color + ", Weight: " + weight + "kg)";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bag) {
            Bag bag = (Bag) obj;
            return Objects.equals(this.type, bag.type) && Objects.equals(this.material, bag.material);
        }
        return false;
    }
}
