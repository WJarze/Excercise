package io.fileShow;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String filePath = "E:\\Nauka\\Programowanie\\Ksiązki programowanie\\java\\Horstmann";
        File file = new File ( filePath );
        Files files = new Files ();
        files.printFileList (file);
        System.out.println (file.exists () );
        files.printFileStream ( file );
    }
}
