package CigarettePackage;

public class Cigarette {
    String brand;
    int nicotineLevel;

    public Cigarette(String brand, int nicotineLevel) {
        this.brand = brand;
        this.nicotineLevel = nicotineLevel;
        System.out.println("CIGARETTE DETAILS");
        System.out.println("----------------------");
    }

    public void showCigaretteInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Nicotine Level: " + this.nicotineLevel + " mg");
    }
}
