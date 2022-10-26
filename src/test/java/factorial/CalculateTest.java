package factorial;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculateTest {
    //when
    Calculate calculate = new Calculate ( );

    @Test
    void shouldReturn120() {
        //given
        long factorialLoop = calculate.factorialUsingLoop ( 5 );
        long factorialRecursion = calculate.factorialUsingRecursion ( 5 );
        long factorialStreams = calculate.factorialUsingStreams( 5 );
        // then
        Assert.assertEquals(120,factorialLoop);
        Assert.assertEquals(120,factorialRecursion);
        Assert.assertEquals(120,factorialStreams);
    }
}