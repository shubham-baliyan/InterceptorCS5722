package headfirst.designpatterns.observer.weather;

public interface Interceptor {
   public boolean onPreMarshallRequest(Context context,String arg);
   public void onPostMarshallRequest( Context context,String arg);
}
