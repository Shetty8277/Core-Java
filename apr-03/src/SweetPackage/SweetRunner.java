package SweetPackage;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet = new Sweet("Mysore Pak", "Karnataka");
        SweetShop shop = new SweetShop("Sri Krishna Sweets", sweet);
        shop.displayShop();
    }
}
