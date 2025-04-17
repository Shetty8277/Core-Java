package com.java.login.Internal;

public class Cloth {
    private String type;
    private String color;
    private double price;
    private boolean isCotton;

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCotton(boolean isCotton) {
        this.isCotton = isCotton;
    }

    @Override
    public String toString() {
        return "Cloth(Type: " + type + ", Color: " + color + ", Price: $" + price + ", Cotton: " + isCotton + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cloth) {
            Cloth cloth = (Cloth) obj;
            return this.type.equals(cloth.type) && this.color.equals(cloth.color);
        }
        return false;
    }
}
