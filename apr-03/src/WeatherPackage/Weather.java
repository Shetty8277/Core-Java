package WeatherPackage;

public class Weather {
    String temperature;
    String condition;

    public Weather(String temperature, String condition) {
        this.temperature = temperature;
        this.condition = condition;
        System.out.println("WEATHER DETAILS");
        System.out.println("----------------------");
    }

    public void showWeather() {
        System.out.println("The temperature is: " + this.temperature);
        System.out.println("The weather condition is: " + this.condition);
    }
}
