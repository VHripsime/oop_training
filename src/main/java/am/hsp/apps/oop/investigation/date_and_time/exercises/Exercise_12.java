package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get localized day-in-week name.
 * 
 * @author user
 *
 */
public class Exercise_12 {

    public static void main(String[] args) {

        printWeekDaysInGivenLanguage("ru");
    }

    /**
     * Prints week day names in given language.
     * 
     * @param localId
     */
    private static void printWeekDaysInGivenLanguage(String localId) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale(localId));
        String[] dayNames = symbols.getWeekdays();

        System.out.println(Arrays.toString(dayNames));
    }
}
