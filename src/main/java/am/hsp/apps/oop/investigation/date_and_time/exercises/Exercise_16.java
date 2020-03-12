package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.LocalDate;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get a date after 2 weeks.
 * 
 * @author user
 *
 */
public class Exercise_16 {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        System.out.println("The current date is: " + currentDate);
        System.out.println("Date after 2 weeks : " + currentDate.plusWeeks(2));
    }
}
