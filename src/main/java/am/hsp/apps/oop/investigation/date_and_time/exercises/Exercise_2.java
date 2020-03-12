package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.util.Calendar;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get and display information (year, month, day, hour,
 * minute) of a default calendar.
 * 
 * @author hripsime
 *
 */
public class Exercise_2 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
