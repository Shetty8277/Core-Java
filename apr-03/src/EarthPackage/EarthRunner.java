package EarthPackage;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth = new Earth("Terrestrial", 4);
        Planet planet = new Planet("Milky Way", earth);
        planet.planetInfo();
    }
}
