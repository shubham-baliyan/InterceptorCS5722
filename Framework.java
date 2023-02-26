package headfirst.designpatterns.observer.weather;

public class Framework {
    Context context;
    Dispatcher dispatcher;


    public Dispatcher  createDispatcher(){
         dispatcher = new Dispatcher();
         return dispatcher;
    }

    public void setValueEvent(float temperature, float humidity, float pressure,WeatherData weatherData){
        context = new Context(temperature,humidity,pressure,weatherData);
        dispatcher.notify(context);
    }

}
