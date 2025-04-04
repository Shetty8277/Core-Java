package GoldPackage;

public class GoldRunner {
    public static void main(String[] args) {

        Gold gold = new Gold("24.52 Gm","India");

        Jewllery jewllery = new Jewllery("Mallabar",gold);
        jewllery.JewlleryShop();

    }
}
