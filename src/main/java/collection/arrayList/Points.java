package collection.arrayList;

import java.util.ArrayList;

public class Points {
    ArrayList<Point> points;

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

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Points{" +
                "points=" + points +
                '}';
    }
}
