package collection.arrayList.joinarray;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public List<String> join(List<String> array1, List<String> array2){
        List<String> arrayJoin = new ArrayList<> ();
        arrayJoin.addAll ( array1 );
        arrayJoin.addAll ( array2 );
        System.out.println (arrayJoin );
        return arrayJoin;
    }
}
