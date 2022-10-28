package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Appointment {
    public String description;
    public LocalDate date;
    public ArrayList<String> names = new ArrayList<>();
    public ArrayList<Integer> days = new ArrayList<>();
    public ArrayList<Integer> months = new ArrayList<>();
    public ArrayList<Integer> years = new ArrayList<>();

    public void SetDate(LocalDate date) {
        this.date = date;
    }

    public int userInput() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }

    public int getYear() {
        return date.getYear();
    }

    public int getMonth() {
        return date.getMonthValue();
    }

    public int getDay() {
        return date.getDayOfMonth();
    }

    public boolean occursOn(LocalDate newDate) {
        if (date.equals(newDate)) {
            return true;
        }
        return false;
    }

    public void addAppointment(String name, int day, int month, int year) {
        names.add(name);
        days.add(day);
        months.add(month);
        years.add(year);
    }

}
