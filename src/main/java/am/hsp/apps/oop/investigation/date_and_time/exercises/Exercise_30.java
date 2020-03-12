package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.LocalDate;
import java.time.Period;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to compute the difference between two dates (year,
 * months, days).
 * 
 * @author user
 *
 */
public class Exercise_30 {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2015, 3, 28);
        LocalDate end = LocalDate.of(2019, 1, 14);
        Period difference = Period.between(start, end);

        System.out.println("The difference is: " + difference.getYears() + " years, " + difference.getMonths()
                + " months, " + difference.getDays() + " days");

    }
}
