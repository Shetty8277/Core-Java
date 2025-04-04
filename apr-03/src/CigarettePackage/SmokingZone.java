package CigarettePackage;

public class SmokingZone {
    Cigarette cigarette;
    String location;

    public SmokingZone(String location, Cigarette cigarette) {
        this.cigarette = cigarette;
        this.location = location;
    }

    public void displayZone() {
        if (cigarette != null) {
            cigarette.showCigaretteInfo();
        } else {
            System.err.println("Cigarette instance is null");
        }
        System.out.println("Smoking Zone Location: " + this.location);
    }
}
