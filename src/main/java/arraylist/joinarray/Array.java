package arraylist.joinarray;

import java.util.ArrayList;

public class Array {

    public ArrayList<String> join(ArrayList<String> array1, ArrayList<String> array2){
        ArrayList<String> arrayJoin = new ArrayList<> ();
        arrayJoin.addAll ( array1 );
        arrayJoin.addAll ( array2 );
        System.out.println (arrayJoin );
        return arrayJoin;
    }
}
