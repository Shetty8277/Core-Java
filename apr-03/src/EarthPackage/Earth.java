package EarthPackage;

public class Earth {
    String type;
    int age;

    public Earth(String type, int age) {
        this.type = type;
        this.age = age;
        System.out.println("EARTH DETAILS");
        System.out.println("----------------------");
    }

    public void showDetails() {
        System.out.println("Earth Type: " + this.type);
        System.out.println("Estimated Age: " + this.age + " billion years");
    }
}
