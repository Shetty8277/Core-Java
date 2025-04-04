package EarbudPackage;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud = new Earbud("Sony", "Bluetooth");
        EarbudStore store = new EarbudStore("Croma", earbud);
        store.displayStore();
    }
}
