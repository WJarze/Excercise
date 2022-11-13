package collection.linkedList.mixinglist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numInt = new LinkedList<> (  );
        Listing listing = new Listing (numInt);
        listing.add(1);
        listing.add(2);
        listing.add(3);
        listing.add(4);
        List<Integer> mixNumList = new LinkedList<> ( numInt );
        System.out.println (mixNumList );
        listing.mix ( numInt,mixNumList );
    }
}
