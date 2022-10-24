package monthCalculator;

import java.time.YearMonth;

public class MonthCalculator implements Calculate{
    @Override
    public int dayNumber(int year , int month) {
        return YearMonth.of(year, month).lengthOfMonth();
    }
}
