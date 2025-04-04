package EarbudPackage;

public class EarbudStore {
    Earbud earbud;
    String storeName;

    public EarbudStore(String storeName, Earbud earbud) {
        this.earbud = earbud;
        this.storeName = storeName;
    }

    public void displayStore() {
        if (earbud != null) {
            earbud.showEarbudInfo();
        } else {
            System.err.println("Earbud instance is null");
        }
        System.out.println("Store Name: " + this.storeName);
    }
}
