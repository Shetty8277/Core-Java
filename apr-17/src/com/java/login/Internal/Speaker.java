package com.java.login.Internal;

import java.util.Objects;

public class Speaker {
    private String brand;
    private int wattage;
    private boolean bluetoothEnabled;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        this.bluetoothEnabled = bluetoothEnabled;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Speaker(Brand: " + brand + ", Wattage: " + wattage + "W, Bluetooth: " + bluetoothEnabled + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Speaker) {
            Speaker other = (Speaker) obj;
            return Objects.equals(this.brand, other.brand) && this.wattage == other.wattage;
        }
        return false;
    }
}
