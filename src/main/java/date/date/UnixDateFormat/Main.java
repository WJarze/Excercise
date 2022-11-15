package date.date.UnixDateFormat;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        long timestamp = 1659935340;
        FormatDate formatDate = new FormatDate ( timestamp, new Date (timestamp * 1000));
        String dat = formatDate.getDateFormat ( );
        System.out.println("data: " + dat);
        Logger logger = LoggerFactory.getLogger(FormatDate.class);
        logger.info("data: " + dat);
    }


}
