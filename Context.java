package headfirst.designpatterns.observer.weather;

public class Context
{
   public Context(float temperature,float humidity,float pressure, WeatherData weatherData){
        this.humidity=humidity;
        this.temperature=temperature;
        this.pressure=pressure;
        this.weatherData =weatherData;

    }
    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    private void doSomething(){
        System.out.println("Hi the temperatur and stuff is unsusal");
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }
}
