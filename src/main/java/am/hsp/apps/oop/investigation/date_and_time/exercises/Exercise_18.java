package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to check a year is a leap year or not.
 * 
 * @author user
 *
 */
public class Exercise_18 {

    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);

        System.out.println("Is the current year leap?: " + calendar.isLeapYear(year));
    }
}
