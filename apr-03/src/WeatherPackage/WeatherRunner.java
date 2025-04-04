package WeatherPackage;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather = new Weather("30°C", "Sunny");
        Forecast forecast = new Forecast("Bangalore", weather);
        forecast.showForecast();
    }
}
