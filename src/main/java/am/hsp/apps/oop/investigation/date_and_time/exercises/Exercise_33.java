package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get the next and previous Friday.
 * 
 * @author user
 *
 */
public class Exercise_33 {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        System.out.println("Next Friday is: " + currentDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday was: " + currentDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    }
}
