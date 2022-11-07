package collection.linkedList.toTable;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<> ();
        list.add("Adam");
        list.add("Maria");
        list.add("Ewa");
        list.add("Ada");
        for ( Iterator<String> iterator = list.iterator(); iterator.hasNext ( ); ) {
            String element = iterator.next ( );
            System.out.println (element );
        }

        String[] tab = list.toArray (new String[list.size ( )]);
        for (String element : tab) {
            System.out.println (element );
        }
        System.out.println (tab.length );
    }
}
