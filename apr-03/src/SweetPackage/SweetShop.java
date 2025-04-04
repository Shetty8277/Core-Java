package SweetPackage;

public class SweetShop {
    Sweet sweet;
    String shopName;

    public SweetShop(String shopName, Sweet sweet) {
        this.sweet = sweet;
        this.shopName = shopName;
    }

    public void displayShop() {
        if (sweet != null) {
            sweet.sweetInfo();
        } else {
            System.err.println("Sweet instance is null");
        }
        System.out.println("Shop Name: " + this.shopName);
    }
}
