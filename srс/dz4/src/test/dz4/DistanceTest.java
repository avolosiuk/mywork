package dz4;
import org.junit.*;

import static org.junit.Assert.*;

public class DistanceTest {

    @org.junit.Test
    public void testDistance() throws Exception {
        Distance distance=new Distance();
        final double result=distance.distance(1,2,3,4);
        Assert.assertEquals(2.8,result,2);

    }
}