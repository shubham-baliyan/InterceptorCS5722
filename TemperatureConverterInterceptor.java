package headfirst.designpatterns.observer.weather;

public class TemperatureConverterInterceptor implements  Interceptor{
    @Override
    public boolean onPreMarshallRequest(Context context, String arg) {
        float newTemp = (context.getTemperature()-32) *5/9;
        System.out.println("The converted temp from fahrenheit to celsius ="+newTemp);
        return true;
    }

    @Override
    public void onPostMarshallRequest(Context context, String arg) {
        // not doing anything here
    }
}
