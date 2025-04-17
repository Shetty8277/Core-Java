package com.java.login.Internal;

import java.util.Objects;

public class Pizza {
    private String size;
    private String crust;
    private String topping;
    private double price;

    public Pizza(String size, String crust, String topping, double price) {
        this.size = size;
        this.crust = crust;
        this.topping = topping;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza(Size: " + size + ", Crust: " + crust + ", Topping: " + topping + ", Price: $" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pizza) {
            Pizza pizza = (Pizza) obj;
            return Objects.equals(this.size, pizza.size) && Objects.equals(this.crust, pizza.crust);
        }
        return false;
    }
}
