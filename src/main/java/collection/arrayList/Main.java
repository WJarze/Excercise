package collection.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Point point = new Point ( 1 , 1 );
        Points points = new Points ( new ArrayList<> ( ) );
        points.add ( point );
        System.out.println ( points );

    }
}
