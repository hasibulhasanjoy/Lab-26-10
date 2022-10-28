package app;

import java.time.LocalDate;

public class Daily extends Appointment {
    @Override
    public void addAppointment(String name, int day, int month, int year) {
        // TODO Auto-generated method stub
        super.addAppointment(name, day, month, year);
    }

    @Override
    public boolean occursOn(LocalDate newDate) {
        // TODO Auto-generated method stub
        return true;
    }
}
