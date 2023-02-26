package headfirst.designpatterns.observer.weather;

public class IsValidRangeTempInterceptor implements  Interceptor {
    @Override
    public boolean onPreMarshallRequest(Context context, String arg) {
        if(context.getTemperature()>=0 && context.getTemperature()<=104){
            System.out.println("the temperature is in valid range");
            return true;
        }
        System.out.println("The Temperature is out of range can't proceed further");
        return false;
    }

    @Override
    public void onPostMarshallRequest(Context context, String arg) {
        System.out.println(" NOT DOING ANYTHING HERE");
    }
}
