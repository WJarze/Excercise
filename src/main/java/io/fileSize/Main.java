package io.fileSize;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String pathName = "E:\\Nauka\\Programowanie\\Ksiązki programowanie\\java";
        File file = new File ( pathName );
        long size =file.length ( );
        System.out.println (size);
    }
}
