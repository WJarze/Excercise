package sumOfDivisorTest;

import sumOfDivisor.SumDivisor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumDivisorTest {
    private SumDivisor sumDivisor = new SumDivisor ();

    @Test
    public void shouldReturn12For6() {
        // when
        int result = sumDivisor.sum ( 6);

        // then
        Assertions.assertEquals(12, result);
    }
}
