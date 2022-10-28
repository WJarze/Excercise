package UnixDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long timestamp = 1657096202;
        FormatDate formatDate = new FormatDate ( timestamp, new Date (timestamp * 1000));
        String dat = formatDate.getDateFormat ( );
        System.out.println("data: " + dat);

    }


}
