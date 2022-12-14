package Model;



public class Daily extends Appointment {
    private int day;
    private int month;
    private int year;
    String name;

    public Daily(int day, int month, int year, String name) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

}
