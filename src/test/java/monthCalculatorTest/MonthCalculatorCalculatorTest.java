package monthCalculatorTest;


import date.monthCalculator.MonthCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthCalculatorCalculatorTest {

    private MonthCalculator monthCalculator;

    @BeforeEach
    public void init() {
        monthCalculator = new MonthCalculator ( );
    }

    @ParameterizedTest
    @CsvSource({"2001, 8" , "2001, 7" , "2001, 10" , "2001, 1"})
    public void shouldReturn31(int year , int month) {
        // when
        //  Month month = new Month ();
        int dayCount = (monthCalculator.dayNumber ( year , month ));

        // then
        Assertions.assertEquals ( 31 , dayCount );
    }

    @ParameterizedTest
    @CsvSource({"2001, 4" , "2001, 6" , "2001, 9" , "2001, 11"})
    public void shouldReturn30(int year , int month) {
        // when
        int dayCount = monthCalculator.dayNumber ( year , month );

        // then
        Assertions.assertEquals ( 30 , dayCount );
    }


    @ParameterizedTest
    @CsvSource({"2018, 02" , "2022, 02"})
    public void shouldReturn28(int year , int month) {
        // when
        int dayCount = monthCalculator.dayNumber ( year , month );

        // then
        Assertions.assertEquals ( 28 , dayCount );
    }

    @ParameterizedTest
    @CsvSource({"2016, 02" , "2020, 02"})
    public void shouldReturn29(int year , int month) {
        // when
        int dayCount = monthCalculator.dayNumber ( year , month );

        // then
        Assertions.assertEquals ( 29 , dayCount );
    }


}
