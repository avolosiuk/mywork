package dz5;
import org.junit.*;

import static org.junit.Assert.*;

public class SortInsertTest {

    @org.junit.Test
    public void testSortInsert() throws Exception {
        SortInsert sortInsert=new SortInsert();
        int[] arr={-20,1,2,3,4};
        int[] arr1={4,2,-20,3,1};
        int[] result=sortInsert.sortInsert(arr1);

        Assert.assertArrayEquals(arr,result);


    }
}