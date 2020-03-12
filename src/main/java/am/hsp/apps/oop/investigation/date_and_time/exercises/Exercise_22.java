package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.LocalDate;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get the dates 10 days before and after today.
 * 
 * @author user
 *
 */
public class Exercise_22 {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        System.out.println("The current date is: " + currentDate);
        System.out.println("Date before 10 days: " + currentDate.plusDays(-10));
        System.out.println("Date after 10 days: " + currentDate.plusDays(10));

    }
}
