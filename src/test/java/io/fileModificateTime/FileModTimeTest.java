package io.fileModificateTime;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

public class FileModTimeTest {


    @Test
    public void testWhenModification() {
        // Initialize the object to be tested
        String pathName = "E:\\Nauka\\Programowanie\\Ksi¹zki programowanie\\java\\Horstmann";
        File file = new File ( pathName );
        FileModTime fileModifications = new FileModTime ( file );
        Long invokeResult = fileModifications.whenModification ( );
        boolean bool = false;
        if ( invokeResult != null ) {
            bool = true;
        }
        // Write the Assert code
        Assert.assertTrue ( bool );
    }
}