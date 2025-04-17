package com.java.login.Internal;

public class Wardrobe {
    private String material;
    private int doors;
    private boolean hasMirror;
    private double price;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setHasMirror(boolean hasMirror) {
        this.hasMirror = hasMirror;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wardrobe(Material: " + material + ", Doors: " + doors + ", Has Mirror: " + hasMirror + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Wardrobe) {
            Wardrobe wardrobe = (Wardrobe) obj;
            return this.material.equals(wardrobe.material) && this.doors == wardrobe.doors;
        }
        return false;
    }
}
