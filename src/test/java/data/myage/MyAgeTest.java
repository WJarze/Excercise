package data.myage;

import java.util.Calendar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAgeTest {

    @Test
    public void shouldReturn42() {
        Calendar calendar = Calendar.getInstance ();
        MyAge myAge = new MyAge ( calendar , 1981 , 7 , 7 ,10,21,43);

        myAge.setBornDate ();
    }

}