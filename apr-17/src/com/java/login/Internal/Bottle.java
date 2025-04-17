package com.java.login.Internal;

import java.util.Objects;

public class Bottle {
    private String capacity;
    private String cost;
    private String color;
    private String material;

    public Bottle(String capacity,String cost,String color,String material){
        this.capacity = capacity;
        this.color =color;
        this.cost = cost;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bottle(size: " +capacity + ", color: " +color+", cost: "+cost+",material: "+material+")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj  !=null && obj instanceof Bottle){

            Bottle right = (Bottle)obj ;

            if (Objects.equals(this.cost, right.cost) && Objects.equals(this.color, right.color)) {
                System.out.println("Bottle is matching..");
                return true;
            }

        }else {
            System.out.println("the object is null");
        }


    return false;

    }
}
