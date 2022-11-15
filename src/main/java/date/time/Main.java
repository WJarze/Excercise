package date.time;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        ActualTime actualTime = new ActualTime ( Calendar.getInstance ( ) );
        // Get and display information of current date from the calendar:
        actualTime.get ( );
    }
}
