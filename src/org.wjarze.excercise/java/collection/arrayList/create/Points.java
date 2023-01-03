package collection.arrayList.create;

import java.util.List;

public class Points {
    List<Point> points;

    public Points(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void add(Point point) {
        if ( point instanceof Point ) {
            points.add ( point );
        } else {
            System.out.println ( "null" );
        }
    }

    public Point getElement(int i) {
        return points.get ( i );
    }

    public void update(int i , Point point) {
        if ( point instanceof Point ) {
            points.add ( i , point );
        } else {
            System.out.println ( "null" );
        }
    }

    @Override
    public String toString() {
        return "Points{" +
                "points=" + points +
                '}';
    }
}
