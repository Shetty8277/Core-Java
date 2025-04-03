public class SolarSystem {

    String starName;
    int numberOfPlanets;
    String largestPlanet;
    boolean hasAsteroidBelt;
    int numberOfMoons;
    double averageTemperature;
    boolean hasLife;
    String closestPlanetToSun;
    String farthestPlanetFromSun;
    String galaxyName;

    SolarSystem() {
        System.out.println("Default constructor");
    }

    SolarSystem(String starName) {
        this();
        this.starName = starName;
    }

    SolarSystem(String starName, int numberOfPlanets, String largestPlanet, boolean hasAsteroidBelt) {
        this(starName);
        this.numberOfPlanets = numberOfPlanets;
        this.largestPlanet = largestPlanet;
        this.hasAsteroidBelt = hasAsteroidBelt;
    }

    SolarSystem(String starName, int numberOfPlanets, String largestPlanet, boolean hasAsteroidBelt, int numberOfMoons, double averageTemperature, boolean hasLife) {
        this(starName, numberOfPlanets, largestPlanet, hasAsteroidBelt);
        this.numberOfMoons = numberOfMoons;
        this.averageTemperature = averageTemperature;
        this.hasLife = hasLife;
    }

    SolarSystem(String starName, int numberOfPlanets, String largestPlanet, boolean hasAsteroidBelt, int numberOfMoons, double averageTemperature, boolean hasLife, String closestPlanetToSun, String farthestPlanetFromSun, String galaxyName) {
        this(starName, numberOfPlanets, largestPlanet, hasAsteroidBelt, numberOfMoons, averageTemperature, hasLife);
        this.closestPlanetToSun = closestPlanetToSun;
        this.farthestPlanetFromSun = farthestPlanetFromSun;
        this.galaxyName = galaxyName;
    }

    public void displayInfo() {
        System.out.println("Solar System Information");
        System.out.println("Star Name: " + this.starName);
        System.out.println("Number of Planets: " + this.numberOfPlanets);
        System.out.println("Largest Planet: " + this.largestPlanet);
        System.out.println("Has Asteroid Belt: " + (this.hasAsteroidBelt ? "Yes" : "No"));
        System.out.println("Number of Moons: " + this.numberOfMoons);
        System.out.println("Average Temperature: " + this.averageTemperature + "°C");
        System.out.println("Supports Life: " + (this.hasLife ? "Yes" : "No"));
        System.out.println("Closest Planet to the Sun: " + this.closestPlanetToSun);
        System.out.println("Farthest Planet from the Sun: " + this.farthestPlanetFromSun);
        System.out.println("Galaxy Name: " + this.galaxyName);
    }

    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem("Sun", 8, "Jupiter", true, 214, -270.0, true, "Mercury", "Neptune", "Milky Way");
        solarSystem.displayInfo();
    }
}
