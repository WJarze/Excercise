package io.fileShow;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;
 
public class FilesTest {

 
    @Test
    public void testPrintFileList() { 
        // Initialize the object to be tested
        String filePath = "E:\\Nauka\\Programowanie\\Ksi¹zki programowanie\\java\\Horstmann";
        File file = new File ( filePath );
        Files files = new Files ();

        // Initialize params of the method

        boolean bool = file.exists ();

        // Write the Assert code
        Assert.assertTrue(bool);
        //Assert.assertEquals(expected, actual);
    }
}