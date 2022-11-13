package data.date.UnixDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    private long timestamp;
    Date date;

    public FormatDate(long timestamp , Date date) {
        this.timestamp = timestamp;
        this.date = date;
    }

    public String getDateFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yy:HH:mm:ss");
        String dat = sdf.format(date);
        return dat;
    }
}
