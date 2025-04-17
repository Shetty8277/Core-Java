package com.java.login.Runner;

import com.java.login.Internal.Switch;

public class SwitchRunner {
    public static void main(String[] args) {
        Switch switch1 = new Switch();
        switch1.setType("Smart");
        switch1.setSmart(true);
        switch1.setPrice(25.00);
        switch1.setOn(true);

        Switch switch2 = new Switch();
        switch2.setType("Regular");
        switch2.setSmart(false);
        switch2.setPrice(10.00);
        switch2.setOn(false);

        Switch switch3 = new Switch();
        switch3.setType("Smart");
        switch3.setSmart(true);
        switch3.setPrice(30.00);
        switch3.setOn(true);

        System.out.println(switch1.equals(switch2)); // false
        System.out.println(switch1.equals(switch3)); // true

        System.out.println(switch1);
        System.out.println(switch2);
        System.out.println(switch3);
    }
}
