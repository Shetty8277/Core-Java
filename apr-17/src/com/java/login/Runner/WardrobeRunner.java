package com.java.login.Runner;

import com.java.login.Internal.Wardrobe;

public class WardrobeRunner {
    public static void main(String[] args) {
        Wardrobe wardrobe1 = new Wardrobe();
        wardrobe1.setMaterial("Wood");
        wardrobe1.setDoors(4);
        wardrobe1.setHasMirror(true);
        wardrobe1.setPrice(300.00);

        Wardrobe wardrobe2 = new Wardrobe();
        wardrobe2.setMaterial("Metal");
        wardrobe2.setDoors(3);
        wardrobe2.setHasMirror(false);
        wardrobe2.setPrice(250.00);

        Wardrobe wardrobe3 = new Wardrobe();
        wardrobe3.setMaterial("Wood");
        wardrobe3.setDoors(4);
        wardrobe3.setHasMirror(true);
        wardrobe3.setPrice(350.00);

        System.out.println(wardrobe1.equals(wardrobe2)); // false
        System.out.println(wardrobe1.equals(wardrobe3)); // true

        System.out.println(wardrobe1);
        System.out.println(wardrobe2);
        System.out.println(wardrobe3);
    }
}
