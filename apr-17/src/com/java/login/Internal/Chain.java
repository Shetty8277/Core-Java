package com.java.login.Internal;

public class Chain {
    private String material;
    private double length;
    private double price;
    private boolean isGold;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGold(boolean isGold) {
        this.isGold = isGold;
    }

    @Override
    public String toString() {
        return "Chain(Material: " + material + ", Length: " + length + "m, Price: $" + price + ", Gold: " + isGold + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chain) {
            Chain chain = (Chain) obj;
            return this.material.equals(chain.material) && this.length == chain.length;
        }
        return false;
    }
}
