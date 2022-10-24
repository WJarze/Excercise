package fibonacci;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class FibonacciTest {
    // when
    private Fibonacci fibonacci;
    private Check check;

    @BeforeEach
    public void init() {
        //Given
        fibonacci = new Fibonacci ( );
        check = new Check ( );
    }

    @Test
    public void shouldReturnFive() {
        // when
        int result = fibonacci.calculate ( 8 );

        int expected = 21;
        // then
        // assertThat(isFibo).isTrue();
        Assertions.assertEquals ( expected , result );
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 8, 13})
    void shouldBeFibonacciNumbers(int number) {
        // when
        boolean isFibo = check.isFibonacci ( number );
        Assertions.assertTrue( isFibo) ;

    }

}