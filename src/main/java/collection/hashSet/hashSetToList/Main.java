package collection.hashSet.hashSetToList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
        name.stream( )
                .toList ()
                .forEach ( System.out::println );
    }
}
