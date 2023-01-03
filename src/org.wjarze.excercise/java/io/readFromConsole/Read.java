package io.readFromConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read {
    InputStream in = System.in;
    InputStreamReader inputStream = new InputStreamReader ( in );
    BufferedReader input = new BufferedReader ( inputStream );

    Scanner scanner = new Scanner ( in );

    public String readBuffer() throws IOException {
        return input.readLine ( );
    }

    public String readScanner()  {
        return scanner.nextLine ( );
    }
    public int readScannerOnlyInteger() {
        //String pattern ="[0-9]{10}";
        int numbers = 6;
        int count = 0;
        int str= 0;
        while (count < numbers) {
            boolean bool = scanner.hasNextInt ( );
            if ( bool ) {
                str = scanner.nextInt ( );
                System.out.println (str );
                count++;
                scanner.next ();
            }

        }

        return str;
    }

}
