package date.myage;

import java.util.Calendar;

public class MyAge {
    Calendar bornDate;
    Calendar currentDate;
    int year;
    int month;
    int day;
    int hour;
    int minutes;
    int seconds;

    public MyAge(Calendar bornDate , int year , int month , int day , int hour , int minutes , int seconds) {
        this.bornDate = bornDate;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public MyAge(Calendar currentDate) {
        this.currentDate = currentDate;
    }

    public MyAge(Calendar bornDate , Calendar currentDate) {
        this.bornDate = bornDate;
        this.currentDate = currentDate;
    }

    void setBornDate() {
        bornDate.set ( Calendar.YEAR , year );
        bornDate.set ( Calendar.MONTH , month );
        bornDate.set ( Calendar.DATE , day );
        bornDate.set ( Calendar.HOUR , hour );
        bornDate.set ( Calendar.MINUTE , minutes );
        bornDate.set ( Calendar.SECOND , seconds );
    }

    void currentDate() {
        currentDate.getTime ( );
    }

    int yearCalculate() {
        return currentDate.get ( Calendar.YEAR ) - bornDate.get ( Calendar.YEAR );
    }

    int monthCalculate() {
        return currentDate.get ( Calendar.MONTH ) - bornDate.get ( Calendar.MONTH );
    }

    int dayCalculate() {
        return currentDate.get ( Calendar.DATE ) - bornDate.get ( Calendar.DATE );
    } int minutesCalculate() {
        return currentDate.get ( Calendar.MINUTE ) - bornDate.get ( Calendar.MINUTE );
    } int secondsCalculate() {
        return currentDate.get ( Calendar.SECOND ) - bornDate.get ( Calendar.SECOND );
    }

}
