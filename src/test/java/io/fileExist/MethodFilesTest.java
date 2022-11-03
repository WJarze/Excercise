package io.fileExist;

import org.junit.Assert;
import org.junit.Test;
import java.io.File;

public class MethodFilesTest {


    @Test
    public void testCreateObjectFile() {
        // Initialize the object to be tested
        MethodFiles methodFiles = new MethodFiles ( );
        Files files = new Files ( );
        File file = methodFiles.createObjectFile ( files );
        // Initialize params of the method
        boolean bool = file.exists ( );
        // Write the Assert code
        Assert.assertTrue ( bool );
    }
}