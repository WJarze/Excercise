package date.time;

import java.util.Calendar;

public class ActualTime {
    Calendar calendar ;

    public ActualTime(Calendar calendar) {
        this.calendar = calendar;
    }

    // Get and display information of current date from the calendar:
    void get() {
        System.out.println ( "\n" + calendar.get ( Calendar.DATE ) + "."
                + calendar.get ( Calendar.MONTH ) + "."
                + calendar.get ( Calendar.YEAR ) + "."
                + calendar.get ( Calendar.HOUR ) + ":"
                + calendar.get ( Calendar.MINUTE ) + ":"
                + calendar.get ( Calendar.SECOND ) + ":"
                + calendar.get ( Calendar.MILLISECOND ) );
    }
}
