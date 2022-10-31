package io.fileShow;

import java.io.File;
import java.util.Arrays;

public class Files {

    public void printFileList(File file) {
        String[] fileList = file.list ( );
        for (String nameFile : fileList) {
            System.out.println ( nameFile );
        }
    }

    void printFileStream(File file) {
        Arrays.stream ( file.list ( ) ).forEach ( x -> System.out.println(x) );
    }
}
