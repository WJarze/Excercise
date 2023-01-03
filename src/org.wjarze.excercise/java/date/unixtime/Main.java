package date.unixtime;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Unix unixTime = new Unix ( Calendar.getInstance ());
        unixTime.clear ();
        unixTime.get ();
    }
}
