package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.util.Calendar;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to create a Date object using the Calendar class.
 * 
 * @author hripsime
 *
 */
public class Exercise_1 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 5, 29);

        System.out.println(calendar.getTime());
    }
}
