package main.java.am.hsp.apps.oop.investigation.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/**
 * In Java 1.1 we can create a specific date with the Date class, which
 * represents both the date and time, whether we want it or not. We can use the
 * Calendar class beginning with Java 1.2. But the new way introduced in Java
 * 1.8 is much better.
 * 
 * @author user
 *
 */
public class OldAndNewWaysDemo {

    public static void main(String[] args) {

        System.out.println("Creating an object with the current date:");
        Date currentDate = new Date(); /* old way. */
        System.out.println(currentDate);
        LocalDate currentLocalDate = LocalDate.now(); /* new way */
        System.out.println(currentLocalDate);

        System.out.println("\nCreating an object with the current date and time:");
        Date dateAndTime = new Date(); /* old way. */
        System.out.println(dateAndTime);
        LocalDateTime localDateAndTime = LocalDateTime.now(); /* new way */
        System.out.println(localDateAndTime);

        System.out.println("\nCreating an object representing April 08, 2016");
        // The old way
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.APRIL, 8);
        Date calendarDate = calendar.getTime();
        System.out.println(calendarDate);

        // The new way
        LocalDate localDate = LocalDate.of(2016, Month.APRIL, 8);
        System.out.println(localDate);

        System.out.println("\nAdding a day in a date object:");
        // The old way
        System.out.println(getDateAfterChangingDays(currentDate, 5));
        // The new way
        System.out.println(getDateAfterChangingDays(localDate, 10));
    }

    /**
     * Adding days to the given date using the old way.
     * 
     * @param date
     * @param daysAmount
     * @return
     */
    private static Date getDateAfterChangingDays(Date date, int daysAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, daysAmount);

        return calendar.getTime();
    }

    /**
     * Adding days to the given date using the new way.
     * 
     * @param date
     * @param daysAmount
     * @return
     */
    private static LocalDate getDateAfterChangingDays(LocalDate date, int daysAmount) {
        return date.plusDays(daysAmount);
    }
}
