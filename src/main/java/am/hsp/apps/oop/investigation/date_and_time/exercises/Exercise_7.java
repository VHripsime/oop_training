package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.util.Calendar;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get the last day of the current month.
 * 
 * @author user
 *
 */
public class Exercise_7 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
