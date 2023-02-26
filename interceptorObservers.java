package headfirst.designpatterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class interceptorObservers {

     List<Interceptor> interceptors = new ArrayList<Interceptor>();

     public void attach(Interceptor interceptor){
         interceptors.add(interceptor);
     }
     public void detach(Interceptor interceptor){
         interceptors.remove(interceptor);
     }


}
