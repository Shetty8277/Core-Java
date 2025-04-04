package UmbrellaPackage;

public class RainyDay {
    Umbrella umbrella;
    String weatherCondition;

    public RainyDay(String weatherCondition, Umbrella umbrella) {
        this.umbrella = umbrella;
        this.weatherCondition = weatherCondition;
    }

    public void displayWeather() {
        if (umbrella != null) {
            umbrella.showDetails();
        } else {
            System.err.println("Umbrella instance is null");
        }
        System.out.println("Weather Condition: " + this.weatherCondition);
    }
}
