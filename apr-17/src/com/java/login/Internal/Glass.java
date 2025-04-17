package com.java.login.Internal;

public class Glass {
    private String material;
    private double price;
    private double capacity;
    private boolean isTumbler;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setTumbler(boolean isTumbler) {
        this.isTumbler = isTumbler;
    }

    @Override
    public String toString() {
        return "Glass(Material: " + material + ", Price: $" + price + ", Capacity: " + capacity + "L, Tumbler: " + isTumbler + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Glass) {
            Glass glass = (Glass) obj;
            return this.material.equals(glass.material) && this.capacity == glass.capacity;
        }
        return false;
    }
}
