package collection.arrayList.minvalue;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<> ( );
        list.add ( 1 );
        list.add ( 5 );
        list.add ( 9 );
        list.add ( 2 );
        list.add ( 3 );
        for (Integer num : list) {
            System.out.println ( num );
        }
        int minValue = list.get ( 0 );
        for (Integer num : list) {
            if ( num < minValue ) {
                minValue = num;
            }
        }
        System.out.println ( minValue );
    }
}
