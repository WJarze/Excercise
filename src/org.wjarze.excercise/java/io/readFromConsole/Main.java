package io.readFromConsole;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Read reader = new Read();
        System.out.println (reader.readBuffer () );
        System.out.println (reader.readScanner () );
        System.out.println (reader.readScannerOnlyInteger () );
    }
}
