package com.java.login.Internal;

import java.util.Objects;

public class Table {
    private String material;
    private double length;
    private double width;
    private String color;

    public Table(String material, double length, double width, String color) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table(Material: " + material + ", Length: " + length + "m, Width: " + width + "m, Color: " + color + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Table) {
            Table t = (Table) obj;
            if (Objects.equals(this.material, t.material)) {
                System.out.println("Table material match");
                return true;
            }
        }
        return false;
    }
}
