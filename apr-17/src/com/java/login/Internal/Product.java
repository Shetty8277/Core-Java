package com.java.login.Internal;

import java.util.Objects;

public class Product {
    private String name;
    private String category;
    private String sku;
    private double price;

    public Product(String name, String category, String sku, double price) {
        this.name = name;
        this.category = category;
        this.sku = sku;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product(Name: " + name + ", Category: " + category + ", SKU: " + sku + ", Price: " + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Product) {
            Product p = (Product) obj;
            if (Objects.equals(this.sku, p.sku) && this.price == p.price) {
                System.out.println("Product SKU and price match");
                return true;
            }
        }
        return false;
    }
}
