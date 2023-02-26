package headfirst.designpatterns.observer.weather;

public class WeatherStation {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		// these are the observers for the weather display
		CurrentConditionsDisplay currentDisplay =
				new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		// creating the framework
		Framework framework = new Framework();
		Dispatcher dispatcher =framework.createDispatcher();

		// creating concrete interceptors
		TemperatureConverterInterceptor temperatureConverterInterceptor = new TemperatureConverterInterceptor();
		IsValidRangeTempInterceptor isValidRangeTempInterceptor = new IsValidRangeTempInterceptor();

		//attaching the interceptors
		dispatcher.attach(isValidRangeTempInterceptor);
		dispatcher.attach(temperatureConverterInterceptor);

		// firing the event
		framework.setValueEvent(80, 65, 30.4f,weatherData);
		framework.setValueEvent(40, 55, 30.4f,weatherData);
		//this req will be rejected by the first interceptor
		framework.setValueEvent(-10, 54, 31.4f,weatherData);




	}
}
