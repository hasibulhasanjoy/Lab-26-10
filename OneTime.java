package app;

import java.util.ArrayList;

public class OneTime extends Appointment {

    public ArrayList<String> names = new ArrayList<>();
    public ArrayList<Integer> days = new ArrayList<>();
    public ArrayList<Integer> months = new ArrayList<>();
    public ArrayList<Integer> years = new ArrayList<>();

    @Override
    public void addAppointment(String name, int day, int month, int year) {
        // TODO Auto-generated method stub
        super.addAppointment(name, day, month, year);
    }
}
