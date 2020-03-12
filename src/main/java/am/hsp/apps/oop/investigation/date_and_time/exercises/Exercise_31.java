package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to compute the difference between two dates (hours,
 * minutes and seconds).
 * 
 * @author user
 *
 */
public class Exercise_31 {

    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(2017, 1, 14, 0, 0);
        LocalDateTime end = LocalDateTime.of(2018, 1, 14, 0, 0);
        Duration duration = Duration.between(start, end);

        System.out.println("Difference in hours is:  " + duration.toHours());
        System.out.println("Difference in minutes is:  " + duration.toMinutes());
        System.out.println("Difference in seconds is:  " + duration.getSeconds());
    }
}
