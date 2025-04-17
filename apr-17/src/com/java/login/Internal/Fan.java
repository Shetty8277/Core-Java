package com.java.login.Internal;

public class Fan {
    private String type;
    private double price;
    private boolean isOscillating;
    private double power;

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOscillating(boolean isOscillating) {
        this.isOscillating = isOscillating;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Fan(Type: " + type + ", Price: $" + price + ", Oscillating: " + isOscillating + ", Power: " + power + "W)";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fan) {
            Fan fan = (Fan) obj;
            return this.type.equals(fan.type) && this.price == fan.price;
        }
        return false;
    }
}
