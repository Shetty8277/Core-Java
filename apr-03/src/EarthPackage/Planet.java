package EarthPackage;

public class Planet {
    Earth earth;
    String galaxy;

    public Planet(String galaxy, Earth earth) {
        this.earth = earth;
        this.galaxy = galaxy;
    }

    public void planetInfo() {
        if (earth != null) {
            earth.showDetails();
        } else {
            System.err.println("Earth instance is null");
        }
        System.out.println("Galaxy: " + this.galaxy);
    }
}
