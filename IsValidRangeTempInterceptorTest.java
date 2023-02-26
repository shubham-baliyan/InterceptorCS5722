package headfirst.designpatterns.observer.weather;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class IsValidRangeTempInterceptorTest {
    Context context;
    @BeforeEach
    void setUp(){
        context = new Context(-2,45,67,null);
    }


    @org.junit.jupiter.api.Test
    void onPreMarshallRequest() {
        assertEquals(false,new IsValidRangeTempInterceptor().onPreMarshallRequest(context,"any"));
    }
}