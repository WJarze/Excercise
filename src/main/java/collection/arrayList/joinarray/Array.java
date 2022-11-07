package collection.arrayList.joinarray;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public List<String> join(ArrayList<String> array1, ArrayList<String> array2){
        List<String> arrayJoin = new ArrayList<> ();
        arrayJoin.addAll ( array1 );
        arrayJoin.addAll ( array2 );
        System.out.println (arrayJoin );
        return arrayJoin;
    }
}
