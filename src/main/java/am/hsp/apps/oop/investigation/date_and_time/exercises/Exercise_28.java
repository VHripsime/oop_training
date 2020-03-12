package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.LocalDateTime;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to display the date time information before some hours
 * and minutes from current date time.
 * 
 * @author user
 *
 */
public class Exercise_28 {

    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("The current date and time is: " + currentDateTime);
        System.out.println("The specified time is: " + currentDateTime.minusHours(10).minusMinutes(5));
    }
}
