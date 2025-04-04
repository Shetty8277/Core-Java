package EarbudPackage;

public class Earbud {
    String brand;
    String connectivityType;

    public Earbud(String brand, String connectivityType) {
        this.brand = brand;
        this.connectivityType = connectivityType;
        System.out.println("EARBUD DETAILS");
        System.out.println("----------------------");
    }

    public void showEarbudInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Connectivity Type: " + this.connectivityType);
    }
}
