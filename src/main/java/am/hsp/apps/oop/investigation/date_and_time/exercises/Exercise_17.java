package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.LocalDate;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get a date before and after 1 year compares to the
 * current date.
 * 
 * @author user
 *
 */
public class Exercise_17 {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        System.out.println("The current date is: " + currentDate);
        System.out.println("Date before 1 year is: " + currentDate.plusYears(-1));
        System.out.println("Date after 1 year is: " + currentDate.plusYears(1));
    }
}
