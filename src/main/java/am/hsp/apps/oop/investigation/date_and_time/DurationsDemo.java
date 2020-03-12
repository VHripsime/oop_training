package main.java.am.hsp.apps.oop.investigation.date_and_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * Period is a day or more of time. Duration class represents hours, minutes and
 * seconds.
 * 
 * @author user
 *
 */
public class DurationsDemo {

    public static void main(String[] args) {

        LocalTime start = LocalTime.of(13, 50);
        LocalTime end = LocalTime.of(16, 40);
        Duration duration = Duration.between(start, end);

        System.out.print("Difference between " + start + " and " + end + " is: ");
        System.out.println(Duration.between(start, end)); // This prints PT2H50M. PT stands for Period of Time.
        System.out.println("Duration in hours: " + duration.toHours());
        System.out.println("Duration in minutes: " + duration.toMinutes());
        System.out.println("Duration in milliseconds: " + duration.toMillis());

        Duration daily = Duration.ofDays(1);
        System.out.println(daily);

        Duration hourly = Duration.ofHours(1);
        System.out.println(hourly);

        Duration everyMinute = Duration.ofMinutes(1);
        System.out.println(everyMinute);

        Duration everyGivenSeconds = Duration.ofSeconds(10);
        System.out.println(everyGivenSeconds);

        Duration everyMilli = Duration.ofMillis(1);
        System.out.println(everyMilli);

        /*
         * Duration doesn't have a constructor that takes multiple units like Period
         * does. If we want something to happen every hour and half, we would specify 90
         * minutes.
         */
        Duration everyHourAndHalf = Duration.ofMinutes(90);
        System.out.println(everyHourAndHalf);

        // Period and Duration are not equivalent.
        LocalDate date = LocalDate.of(2015, 5, 25);
        Period dailyPeriod = Period.ofDays(1);
        Duration dailyDuration = Duration.ofDays(1);
        /*
         * Since we are working with local date, we are required to use Period. Duration
         * has time units in it, and they are meant only for objects with time.
         */
        System.out.println(date.plus(dailyPeriod));
        // System.out.println(date.plus(dailyDuration));
    }
}
