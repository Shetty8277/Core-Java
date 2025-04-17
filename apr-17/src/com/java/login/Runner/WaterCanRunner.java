package com.java.login.Runner;

import com.java.login.Internal.WaterCan;

public class WaterCanRunner {
    public static void main(String[] args) {
        WaterCan waterCan1 = new WaterCan();
        waterCan1.setMaterial("Plastic");
        waterCan1.setCapacity(20.0);
        waterCan1.setPrice(15.00);
        waterCan1.setHasTap(true);

        WaterCan waterCan2 = new WaterCan();
        waterCan2.setMaterial("Metal");
        waterCan2.setCapacity(25.0);
        waterCan2.setPrice(30.00);
        waterCan2.setHasTap(false);

        WaterCan waterCan3 = new WaterCan();
        waterCan3.setMaterial("Plastic");
        waterCan3.setCapacity(20.0);
        waterCan3.setPrice(18.00);
        waterCan3.setHasTap(true);

        System.out.println(waterCan1.equals(waterCan2)); // false
        System.out.println(waterCan1.equals(waterCan3)); // true

        System.out.println(waterCan1);
        System.out.println(waterCan2);
        System.out.println(waterCan3);
    }
}
