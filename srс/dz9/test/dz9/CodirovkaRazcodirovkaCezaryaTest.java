package dz9;
import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by serg on 29.01.2016.
 */
public class CodirovkaRazcodirovkaCezaryaTest {

   private  CodirovkaRazcodirovkaCezarya codirovkaRazcodirovkaCezarya;
    @Before
    public void setUp() throws Exception {
        codirovkaRazcodirovkaCezarya= new CodirovkaRazcodirovkaCezarya();


    }

    @org.junit.Test
    public void testCodCezarya() throws Exception {

        String text=codirovkaRazcodirovkaCezarya.codCezarya("I and my brother");
        Assert.assertEquals("L dqg pb eurwkhu",text);


    }

    @Test
    public void testRazcodCezarya() throws Exception {

        String text=codirovkaRazcodirovkaCezarya.razcodCezarya("45,5,ghf");
        Assert.assertEquals("12,2,dec",text);

    }
}