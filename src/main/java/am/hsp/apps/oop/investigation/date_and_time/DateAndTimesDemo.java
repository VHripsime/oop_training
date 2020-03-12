package main.java.am.hsp.apps.oop.investigation.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTimesDemo {

    public static void main(String[] args) {

        System.out.println("Showing current date and time:");
        System.out.println(LocalDate.now()); /* Contains just a date. */
        System.out.println(LocalTime.now()); /* Contains just a time. */
        System.out.println(LocalDateTime.now()); /* Contains a date and time. */
        System.out.println(ZonedDateTime.now()); /* Contains date, time and zone. */
        System.out.println(ZoneId.systemDefault()); /* Your current time zone */

        System.out.println("\nShowing our specified date and time:");
        LocalDate firstDate = LocalDate.of(2018, 11, 15);
        System.out.println(firstDate);

        LocalDate secondDate = LocalDate.of(2018, Month.NOVEMBER, 15);
        System.out.println(secondDate);

        LocalTime time = LocalTime.of(10, 55, 34);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(firstDate, time);
        System.out.println(dateTime);

        ZoneId zone = ZoneId.of("Europe/Paris");
        ZonedDateTime zoneDateTime = ZonedDateTime.of(dateTime, zone);
        System.out.println(zoneDateTime);
    }
}
