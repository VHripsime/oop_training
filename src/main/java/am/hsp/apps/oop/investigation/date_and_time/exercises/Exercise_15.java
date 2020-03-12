package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.LocalTime;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to add some hours to the current time.
 * 
 * @author user
 *
 */
public class Exercise_15 {

    public static void main(String[] args) {

        System.out.println("The current time is: " + LocalTime.now());
        System.out.println("Time after given hours is: " + getCurrentTimeByAddingHours(1));
    }

    /**
     * Returns the current time after adding hours to it.
     * 
     * @param hours
     * @return
     */
    private static LocalTime getCurrentTimeByAddingHours(int hours) {
        LocalTime time = LocalTime.now();

        return time.plusHours(hours);
    }
}
