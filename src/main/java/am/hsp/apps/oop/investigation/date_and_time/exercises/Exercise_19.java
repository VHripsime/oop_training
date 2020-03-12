package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.LocalDate;
import java.time.Period;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get year and months between two dates.
 * 
 * @author user
 *
 */
public class Exercise_19 {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2017, 3, 21);
        LocalDate end = LocalDate.of(2019, 2, 8);
        Period gap = Period.between(start, end);

        System.out.println("Difference between " + start + " and " + end + " is: " + gap.getMonths() + " months and "
                + gap.getYears() + " years");
    }
}
