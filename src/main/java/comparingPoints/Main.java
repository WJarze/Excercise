package comparingPoints;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point ( 1 , 2 );
        Point point2 = new Point ( 2 , 2 );
        Point point3 = new Point ( 1 , 2 );
        Point point4 = point3;
        Point point5 = point2;
        Point point6 = point1;
        Point point7 = null;

        System.out.println ( point1.equals ( point2 ) );
        System.out.println ( point1.equals ( point3 ) );
        System.out.println ( point3.equals ( point4 ) );
        System.out.println ( point5.equals ( point2 ) );
        System.out.println ( point6.equals ( point2 ) );
        System.out.println ( point1.equals ( point7 ) );

    }
}
