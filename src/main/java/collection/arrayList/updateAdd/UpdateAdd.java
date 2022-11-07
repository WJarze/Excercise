package collection.arrayList.updateAdd;

import java.util.ArrayList;

public class UpdateAdd {
    public static void main(String[] args) {
        Point point = new Point ( 1 , 1 );
        Point point1 = new Point ( 2 , 2 );
        Point point2 = new Point ( 3 , 3 );
        Points points = new Points ( new ArrayList<> ( ) );
        points.add ( point );
        points.add ( point1 );
        points.add ( point2 );
        System.out.println ( points );
        points.updateAdd ( 0 , new Point ( 4 , 4 ) );
        for (Point elem : points.getPoints ( )) {
            System.out.println ( elem );
        }
        System.out.println ( points.getElement ( 2 ) );
    }
}
