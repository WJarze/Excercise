package data.setdate;

public class SetDate {
    private int year ;
    private int month ;
    private int day;

    public SetDate(int year , int month , int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
