package CigarettePackage;

public class CigaretteRunner {
    public static void main(String[] args) {
        Cigarette cigarette = new Cigarette("Marlboro", 12);
        SmokingZone zone = new SmokingZone("Airport Lounge", cigarette);
        zone.displayZone();
    }
}
