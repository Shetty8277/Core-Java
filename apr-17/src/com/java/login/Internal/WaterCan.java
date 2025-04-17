package com.java.login.Internal;

public class WaterCan {
    private String material;
    private double capacity;
    private double price;
    private boolean hasTap;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasTap(boolean hasTap) {
        this.hasTap = hasTap;
    }

    @Override
    public String toString() {
        return "WaterCan(Material: " + material + ", Capacity: " + capacity + "L, Price: $" + price + ", Has Tap: " + hasTap + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof WaterCan) {
            WaterCan waterCan = (WaterCan) obj;
            return this.material.equals(waterCan.material) && this.capacity == waterCan.capacity;
        }
        return false;
    }
}
