import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class СonvertingTemperatureTest {
    private СonvertingTemperature convertingTemperature;

    @Before
    public void setUp() throws Exception {
        convertingTemperature=new СonvertingTemperature();

    }

    @org.junit.Test
    public void testCelcToFar() throws Exception {
       final double result= convertingTemperature.celcToFar(100);
       Assert.assertEquals(212.0,result,2);
    }

    @Test
    public void testFarToCelc() throws Exception {
        final double result= convertingTemperature.farToCelc(100);
        Assert.assertEquals(37.7,result,2);

    }
}