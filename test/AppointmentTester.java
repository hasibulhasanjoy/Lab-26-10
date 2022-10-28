package app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import app.Appointment;

public class AppointmentTester {
    @Test
    public void yearTest() {
        Appointment ap = new Appointment();
        int expected = 2022;
        int actual = ap.getYear();
        assertEquals(expected, actual);
    }
    @Test
    public void monthTest() {
        Appointment ap = new Appointment();
        int expected = 10;
        int actual = ap.getMonth();
        assertEquals(expected, actual);
    }
    @Test
    public void DayTest() {
        Appointment ap = new Appointment();
        int expected = 28;
        int actual = ap.getDay();
        assertEquals(expected, actual);
    }
    @Test 
    public void dateTest() {
        Appointment ap = new Appointment();
        LocalDate expected = ap.date;
        LocalDate actual = LocalDate.now();
        assertEquals(expected, actual);
    }
}
