package collection.linkedList.mixinglist;

import java.util.List;
import java.util.Random;

public class Listing {
    List<Integer> numInt;

    void add( int num) {
        numInt.add ( num );
    }

    public Listing(List<Integer> numInt ) {
        this.numInt = numInt;
    }

    void mix(List<Integer> numInt , List<Integer> mixNumList) {

        for (int i = numInt.size ( ) - 1; i > 0; i--) {
            Random random = new Random ( );

            int randIndex = random.nextInt ( i );
            mixNumList.set ( randIndex , numInt.get ( i ) );
        }
        System.out.println ( mixNumList );

    }

}

