package WeatherPackage;

public class Forecast {
    Weather weather;
    String location;

    public Forecast(String location, Weather weather) {
        this.weather = weather;
        this.location = location;
    }

    public void showForecast() {
        if (weather != null) {
            weather.showWeather();
        } else {
            System.err.println("Weather instance is null");
        }
        System.out.println("The forecast location is: " + this.location);
    }
}
