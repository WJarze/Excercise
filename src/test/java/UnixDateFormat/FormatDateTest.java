package UnixDateFormat;

import data.date.UnixDateFormat.FormatDate;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FormatDateTest {

    @Test
    void getDateFormat() {
        //when
        long timestamp = 1657096202;
        FormatDate formatDate = new FormatDate ( timestamp , new Date ( timestamp * 1000 ) );
        //given
        String dat = formatDate.getDateFormat ( );
        //then
        Assertions.assertEquals ( "06:07:22:10:30:02" , dat );
    }
}