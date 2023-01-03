package date.daymonth;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calndr = Calendar.getInstance ( );
        int month = 9;
        calndr.set ( Calendar.MONTH , month );
        // Getting the required months


        // Getting the lowest maximum month
        int max_day = calndr.getMaximum ( Calendar.DAY_OF_MONTH );
        int min_day = calndr.getMinimum ( Calendar.DAY_OF_MONTH );
        System.out.println ( "Year"
                + " days: " + calndr.get ( Calendar.MONTH ));
        // Displaying the results
        System.out.println ( "The Maximum"
                + " days: " + max_day );
        System.out.println ( "The Minimum"
                + " days: " + min_day );
    }
}
