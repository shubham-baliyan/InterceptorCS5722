package headfirst.designpatterns.observer.weather;

public class TemperatureConverterInterceptor implements  Interceptor{
    @Override
    public boolean onPreMarshallRequest(Context context, String arg) {
        return false;
    }

    @Override
    public void onPostMarshallRequest(Context context, String arg) {
        // not doing anything here
    }
}
