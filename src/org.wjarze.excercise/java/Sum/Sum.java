package Sum;

import java.util.ArrayList;
import java.util.List;


public class Sum {
    Point point1 = new Point ( 0 , 0 );
    Point point2 = new Point ( 1 , 1 );
    Point point3 = new Point ( 2 , 2 );
    Point point4 = new Point ( 3 , 3 );
    List<Point> points = new ArrayList<> ( );

    public void add() {

        points.add ( point1 );
        points.add ( point2 );
        points.add ( point3 );
        points.add ( point4 );

    }

    public double getSumXUsingLoop() {

        double sum = 0;
        for (int i = 0; i < points.size ( ); i++) {
            sum += points.get ( i ).getX ( );
        }
        System.out.println (sum );
        return sum;
    }

    public double getSumXUsingStream() {
        double sum = points.stream ( )
                .map ( Point::getX )
                .mapToDouble (Double::doubleValue)
                .sum (  );
        System.out.println (sum );
        return sum;
    }
}
