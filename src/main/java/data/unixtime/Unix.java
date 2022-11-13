package data.unixtime;

import java.util.Calendar;

public class Unix {
    Calendar calendar;

    public Unix(Calendar calendar) {
        this.calendar = calendar;
    }

    void clear(){
        calendar.clear ();
    }
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
