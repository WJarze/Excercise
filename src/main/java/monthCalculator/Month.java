package monthCalculator;

import java.time.YearMonth;

public class Month implements Calculate{
    @Override
    public int dayNumber(int year , int month) {
        return YearMonth.of(year, month).lengthOfMonth();
    }
}
