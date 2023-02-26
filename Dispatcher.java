package headfirst.designpatterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

     List<Interceptor> interceptors = new ArrayList<Interceptor>();

     public void attach(Interceptor interceptor){
         interceptors.add(interceptor);
     }
     public void detach(Interceptor interceptor){
         interceptors.remove(interceptor);
     }

    public void notify(Context context){
         boolean val=false;
        for (Interceptor interceptor:
             interceptors) {
            val = interceptor.onPreMarshallRequest(context,"hi");
           if(val==false){
               break;
           }
        }
        if(val==true){
            context.getWeatherData().setMeasurements(context.getTemperature(), context.getHumidity(), context.getPressure());

        }
    }
}
