package overlappingFigure;

public class Main {
    public static void main(String[] args) {
        Point triangle1Point1 = new Point ( 0 , 0 );
        Point triangle1Point2 = new Point ( 1 , 0 );
        Point triangle1Point3 = new Point ( 0 , 1 );
        Point[] pointTriangles1 = {triangle1Point1 , triangle1Point2 , triangle1Point3};
        Figure triangle1 = new Figure ( pointTriangles1 );
        Point triangle2Point1 = new Point ( 0 , 0 );
        Point triangle2Point2 = new Point ( 1 , 0 );
        Point triangle2Point3 = new Point ( 0.5 , 1 );
        Point[] pointTriangles2 = {triangle2Point1 , triangle2Point2 , triangle2Point3};
        Figure triangle2 = new Figure ( pointTriangles2 );
        Figure triangle3 = triangle2;
        System.out.println ( triangle1.equals ( triangle2 ) );
        System.out.println ( triangle2.equals ( triangle3 ) );
    }
}
