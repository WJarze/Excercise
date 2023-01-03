package collection.hashSet.hashSetToList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;


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

        name.stream ( )
                .toList ( )
                .forEach ( System.out::println );

        String[] tab = new String[ name.size ( ) ];
        name.toArray ( tab );
        for (String element : tab) {
            System.out.println ( element );
        }
        TreeSet<String> treeSet = new TreeSet<> ( name );
        System.out.println ( "------" + treeSet.isEmpty ( ) + "------" );
        for (Iterator<String> iter = treeSet.iterator ( ); iter.hasNext ( ); ) {
            System.out.println ( iter.next ( ) );
            {

            }
        }

        LinkedList<String> linkedList = new LinkedList<> ( name );
        System.out.println ( "------" + linkedList.isEmpty ( ) + "------" );
        for (Iterator<String> iter = linkedList.iterator ( ); iter.hasNext ( ); ) {
            System.out.println ( iter.next ( ) );

        }
    }
}
