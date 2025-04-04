package UmbrellaPackage;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella("Blue", "Polyester");
        RainyDay day = new RainyDay("Heavy Rain", umbrella);
        day.displayWeather();
    }
}
