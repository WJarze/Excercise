package SumTest;

import Sum.Sum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class SumTest {
    Sum sum = new Sum ( );

    @Test
    public void testGetSumXUsingLoop() {
        // Initialize the object to be tested
        sum.add ( );

        sum.getSumXUsingLoop ( );

        // then
        Assertions.assertEquals ( 6 , sum.getSumXUsingLoop ( ) );
    }
        @Test
        public void testGetSumXUsingStream () {
            sum.add ( );

            sum.getSumXUsingLoop ( );

            // then
            Assertions.assertEquals ( 6 , sum.getSumXUsingStream ( ) );
        }

}