package io.fileModificateTime;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String pathName = "E:\\Nauka\\Programowanie\\Ksiązki programowanie\\java\\Horstmann";
        File file = new File ( pathName );
        FileModTime fileModifications = new FileModTime( file);
        System.out.println ( fileModifications.whenModification (  ) + "\n"
        + fileModifications.showDate ());

    }
}
