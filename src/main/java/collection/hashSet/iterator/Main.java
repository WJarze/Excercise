package collection.hashSet.iterator;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<> ( );
        String name1 = "Adam";
        String name2 = "Aga";
        String name3 = "Ewa";
        String name4 = "Magda";
        name.add ( name1 );
        name.add ( name2 );
        name.add ( name3 );
        name.add ( name4 );

        for (Iterator<String> it = name.iterator ( ); it.hasNext ( ); ) {
            System.out.println ( it.next ( ) );
        }
    }
}
