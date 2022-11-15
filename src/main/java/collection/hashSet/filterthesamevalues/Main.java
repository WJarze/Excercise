package collection.hashSet.filterthesamevalues;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        Square square2 = new Square(4);
        Square square3 = new Square(3);
        Square square4 = new Square(5);
        HashSet<Square> list = new HashSet<> ();

            list.add ( square1 );
            list.add ( square2 );
            list.add ( square3 );
            list.add ( square4 );
        for (Square square : list) {
            System.out.println (square );
        }



    }
}
