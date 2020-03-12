package main.java.am.hsp.apps.oop.investigation.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * The date and time classes are immutable.
 * 
 * @author user
 *
 */
public class DatesAndTimesManipulationDemo {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, 10, 29);
        LocalTime time = LocalTime.of(13, 7, 24);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime.plusDays(2));
        System.out.println(dateTime.minusWeeks(1));
        System.out.println(dateTime.plusMonths(2));
        System.out.println(dateTime.minusYears(2));
        System.out.println(dateTime.plusHours(4));
        System.out.println(dateTime.plusMinutes(3));

        // It is common for date and time methods to be chained:
        LocalDate localDate = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime localTime = LocalTime.of(14, 20);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime).minusDays(1).minusHours(10)
                .minusSeconds(20);
        System.out.println(localDateTime);
    }
}
