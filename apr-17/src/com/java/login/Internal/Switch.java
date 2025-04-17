package com.java.login.Internal;

public class Switch {
    private String type;
    private boolean isSmart;
    private double price;
    private boolean isOn;

    public void setType(String type) {
        this.type = type;
    }

    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "Switch(Type: " + type + ", Smart: " + isSmart + ", Price: $" + price + ", Is On: " + isOn + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Switch) {
            Switch sw = (Switch) obj;
            return this.type.equals(sw.type) && this.isSmart == sw.isSmart;
        }
        return false;
    }
}
