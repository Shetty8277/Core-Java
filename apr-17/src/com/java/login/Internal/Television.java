package com.java.login.Internal;

import java.util.Objects;

public class Television {
    private String brand;
    private String size;
    private String resolution;
    private String price;

    public Television(String brand, String size, String resolution, String price) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Television(Brand: " + brand + ", Size: " + size + ", Resolution: " + resolution + ", Price: " + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Television) {
            Television tv = (Television) obj;
            if (Objects.equals(this.brand, tv.brand)) {
                System.out.println("Television brand match");
                return true;
            }
        }
        return false;
    }
}
