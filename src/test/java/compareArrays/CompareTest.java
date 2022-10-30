package compareArrays;
import array.compareArrays.Compare;
import org.junit.Test;

import org.junit.Assert;

public class CompareTest {

 
    @Test
    public void testCheckMatchesNumber() {
        Compare comparison = new Compare();
        int[] tab1 = {1 , 2 , 3 , 4 , 5 , 6};
        int[] tab2 = {0 , 1 , 2 , 3 , 4 , 5};
        comparison.checkMatchesNumber ( tab1,tab2 );
        int invokeResult = comparison.checkMatchesNumber ( tab1,tab2 );
        // then
        Assert.assertEquals(5, invokeResult);
    }

 
    @Test
    public void testValidate() { 
        // Initialize the object to be tested
        /*
        Compare compare = ObjectInit.random(Compare.class);
        // Initialize params of the method

        int[] tab1 = ObjectInit.random(int[].class);;

        int[] tab2 = ObjectInit.random(int[].class);;

        int count = ObjectInit.random(int.class);;

        int i = ObjectInit.random(int.class);;

        int j = ObjectInit.random(int.class);;
        Int invokeResult = compare.validate(tab1, tab2, count, i, j);

        // Write the Assert code
        //Assert.assertEquals(expected, invokeResult);

         */
    }
}