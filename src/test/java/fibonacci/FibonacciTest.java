package fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
        Assertions.assertEquals ( expected , result );
    }

    @DisplayName("Should be Fibonacci number")
    @ParameterizedTest
    @ValueSource(ints = {1 , 2 , 3 , 5 , 8 , 13 , 21})
    void shouldBeFibonacciNumbers(int number) {
        // when
        // assertThat(isFibo).isTrue();
        boolean isFibo = check.isFibonacci ( number );
        Assertions.assertTrue ( isFibo );

    }

}