import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by serg on 02.02.2016.
 */
public class AreasTest {
       private Areas areas;

    @Before
    public void setUp() throws Exception {
        areas=new Areas();

    }

    @org.junit.Test
    public void testAreasTrangl() throws Exception {
        final double result=areas.areasTrangl(5,5,6);
        Assert.assertEquals(12,result,2);


    }

    @Test
    public void testAreasKectangle() throws Exception {
        final double result=areas.areasKectangle(2,2);
        Assert.assertEquals(4,result,2);

    }

    @Test
    public void testAreasCircle() throws Exception {
        final double result=areas.areasCircle(2);
        Assert.assertEquals(12.5,result,2);

    }
}