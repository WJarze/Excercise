package date.myage;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance ( );
        Calendar currentDate = calendar.getInstance ( );

        MyAge bornDate = new MyAge ( calendar , 1981 , 7 , 7 , 10 , 21 , 43 );
        bornDate.setBornDate ( );
        MyAge date = new MyAge ( currentDate );
        date.currentDate ( );
        MyAge age = new MyAge ( calendar , currentDate );

        System.out.println ( "\n" + calendar.getTime ( ) + "\n" );
        System.out.println ( "\n" + currentDate.getTime ( ) + "\n" );
        System.out.println ( age.yearCalculate ( ) + " years "
                + age.monthCalculate ( ) + " months "
                + age.dayCalculate ( ) + " days "
                + age.minutesCalculate ( ) + " minutes "
                + age.secondsCalculate ( ) + " seconds " );

    }
}
