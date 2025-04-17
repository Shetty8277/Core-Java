package com.java.login.Internal;

public class Bed {
    private String size;
    private String material;
    private double price;
    private boolean isKingSize;

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setKingSize(boolean isKingSize) {
        this.isKingSize = isKingSize;
    }

    @Override
    public String toString() {
        return "Bed(Size: " + size + ", Material: " + material + ", Price: $" + price + ", King Size: " + isKingSize + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bed) {
            Bed bed = (Bed) obj;
            return this.size.equals(bed.size) && this.material.equals(bed.material);
        }
        return false;
    }
}
