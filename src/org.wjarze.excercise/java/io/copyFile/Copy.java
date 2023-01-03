package io.copyFile;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class Copy {

    public void CopyFile(String path1 , String path2) {
        try {
            Files.copy ( Paths.get ( "SingList.txt" ) , Paths.get ( "SingListCopy.txt" ) , StandardCopyOption.REPLACE_EXISTING );
            System.out.println (" the file copy success " );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException ( e );
        }
    }
}

