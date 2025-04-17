package com.java.login.Internal;

import java.util.Objects;

public class Chair {
    private String material;
    private String color;
    private boolean hasArmrest;
    private double price;

    public Chair(String material, String color, boolean hasArmrest, double price) {
        this.material = material;
        this.color = color;
        this.hasArmrest = hasArmrest;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chair(Material: " + material + ", Color: " + color + ", Armrest: " + hasArmrest + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chair) {
            Chair chair = (Chair) obj;
            return Objects.equals(this.material, chair.material) && this.hasArmrest == chair.hasArmrest;
        }
        return false;
    }
}
