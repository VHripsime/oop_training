package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get the current time in New York.
 * 
 * @author user
 *
 */
public class Exercise_5 {

    public static void main(String[] args) {

        printTimeOfGivenZone("America/New_York");
    }

    /**
     * Prints the time of given time zone.
     * 
     * @param id
     */
    private static void printTimeOfGivenZone(String id) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone(id));

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND));
    }
}
