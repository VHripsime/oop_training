package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.Year;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get the information of current year.
 * 
 * @author user
 *
 */
public class Exercise_25 {

    public static void main(String[] args) {

        Year currentYear = Year.now();
        
        System.out.println("The current year is: " + currentYear);
        System.out.println("Is it leap?: " + currentYear.isLeap());
        System.out.println("It has " + currentYear.length() + " days.");
    }
}
