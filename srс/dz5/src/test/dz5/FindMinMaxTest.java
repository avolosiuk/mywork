package dz5;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FindMinMaxTest {
    private FindMinMax findMinMax;

    @org.junit.Before
    public void setUp() throws Exception {
        findMinMax=new FindMinMax();

    }

    @org.junit.Test
    public void testFindMax() throws Exception {
     int max=56;
     int[] Array={45,6,5,56,-17,55};
     int result=findMinMax.findMax(Array);
        Assert.assertEquals(max,result);
    }

    @org.junit.Test
    public void testFindMin() throws Exception {
        int min=-17;
        int[] Array={45,6,5,56,-17,55};
        int result=findMinMax.findMin(Array);
        Assert.assertEquals(min,result);

    }
}