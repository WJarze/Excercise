package data.setdate;


import java.util.Calendar;

public class Main {
    public static void main(String[] args) {


        SetDate setDate = new SetDate ( 1981 , 1 , 10 );
        Calendar cal = Calendar.getInstance ( );
        cal.clear ( );
        cal.set ( Calendar.YEAR , setDate.getYear ( ) );
        cal.set ( Calendar.MONTH , setDate.getMonth ( ) );
        cal.set ( Calendar.DATE , setDate.getDay ( ) );

        System.out.println ( "\n" + cal.getTime ( ) + "\n" );

    }
}
