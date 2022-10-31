package io.fileExist;

import java.io.File;

public class MethodFiles {
    public File isFileExist(Files files){
        files.setPathName ( "E:\\Nauka\\Programowanie\\Ksiązki programowanie\\java\\Horstmann");
        files.setFile ( new File ( files.getPathName () ) );
        return files.getFile ();
    }
}
