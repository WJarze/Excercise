package date.daymonth;

import java.util.Calendar;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DayMonthTest {
    Calendar calendar = Calendar.getInstance ( );
    Days days = new Days ( calendar );
    int year = 2022;
    int month = 11;
    @Test
    void should_return_30() {
        int numDays = days.daysPerMonth ( year , month );
        Assert.assertEquals ( 30 , numDays );
    }

}