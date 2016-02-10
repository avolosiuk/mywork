package dz10;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class SaveAndLoadFileTest {

    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void testLoadCodFile() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SaveAndLoadFile saveAndLoadFile = new SaveAndLoadFile();
        saveAndLoadFile.loadCodFile("d:\\example.txt");
        String exepcted="example;\r\n";
        Assert.assertEquals(exepcted,outContent.toString());

    }
}