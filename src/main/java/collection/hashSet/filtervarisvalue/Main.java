package collection.hashSet.filtervarisvalue;

import collection.arrayList.joinarray.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square (5);
        Square square2 = new Square (4);
        Square square3 = new Square (3);
        Square square4 = new Square (5);
        HashSet<Square> list = new HashSet<> ();

        list.add ( square1 );
        list.add ( square2 );
        list.add ( square3 );
        list.add ( square4 );
        for (Square square : list) {
            System.out.println (square + "\n");
        }

        Iterator<Square> iterator = list.iterator();
        while (iterator.hasNext()) {
            Square currentName = iterator.next();
            if (currentName.equals ( square1 )  ) {
                iterator.remove();
            }
        }
        for (Square square : list) {
            System.out.println (square );
        }
    }
}
