package com.java.login.Internal;

import java.util.Objects;

public class Monitor {
    private String brand;
    private double size;
    private String resolution;
    private boolean isCurved;

    public Monitor(String brand, double size, String resolution, boolean isCurved) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        this.isCurved = isCurved;
    }

    @Override
    public String toString() {
        return "Monitor(Brand: " + brand + ", Size: " + size + " inches, Resolution: " + resolution + ", Curved: " + isCurved + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Monitor) {
            Monitor m = (Monitor) obj;
            if (Objects.equals(this.brand, m.brand)) {
                System.out.println("Monitor brand match");
                return true;
            }
        }
        return false;
    }
}
