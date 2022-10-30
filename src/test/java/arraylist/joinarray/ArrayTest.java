package arraylist.joinarray;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
 
public class ArrayTest {

    @Test
    public void testJoin() { 
        // Initialize the object to be tested
        Main main = new Main ();
        Array array = new Array ( );
        // Initialize params of the method
        ArrayList<String> array1 = new ArrayList<> (  );
        array1.add( "java");
        array1.add( "is");
        array1.add( "the");
        array1.add( "best");
        ArrayList<String> array2 = new ArrayList<> (  );
        array2.add( "in");
        array2.add( "the");
        array2.add( "world");
        ArrayList<String> arrayJoin = array.join(array1, array2);
        int length1 = array1.size();
        int length2 = array2.size();
        int lengthJoin = arrayJoin.size();
        boolean resultValue = (length1 < lengthJoin ||  length2 < lengthJoin) ? true : false;

        // Write the Assert code
        Assert.assertTrue(resultValue);

    }
}