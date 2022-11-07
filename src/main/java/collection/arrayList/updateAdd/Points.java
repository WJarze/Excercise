package collection.arrayList.updateAdd;

import java.util.ArrayList;
import java.util.List;

public class Points {
    List<Point> points;

    public Points(ArrayList<Point> points) {
        this.points = points;
    }

    public void add(Point point) {
        if ( point instanceof Point ) {
            points.add ( point );
        } else {
            System.out.println ( "null" );
        }
    }
    public void updateAdd(int i, Point point) {
        if ( point instanceof Point ) {
            points.add (i, point );
        } else {
            System.out.println ( "null" );
        }
    }
    public Point getElement(int i) {
        return points.get ( i );
    }

    public List<Point> getPoints() {
        return points;
    }


    @Override
    public String toString() {
        return "Points{" +
                "points=" + points +
                '}';
    }
}
