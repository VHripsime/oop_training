package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.LocalDate;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get the months remaining in the year.
 * 
 * @author user
 *
 */
public class Exercise_23 {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        System.out.println("The remaining months amount is: " + (12 - currentDate.getMonthValue()));
    }
}
