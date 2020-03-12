package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to convert a string to date.
 * 
 * @author user
 *
 */
public class Exercise_29 {

    public static void main(String[] args) {

        String stringDate = "May 1, 2018";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(stringDate, formatter);

        System.out.println(date);
    }
}
