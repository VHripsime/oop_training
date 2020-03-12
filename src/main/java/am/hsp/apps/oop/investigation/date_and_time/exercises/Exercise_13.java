package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.YearMonth;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get a day of the week of a specific date.
 * 
 * @author user
 *
 */
public class Exercise_13 {

    public static void main(String[] args) {

        System.out.println(getWeekDayOfGivenDate(2019, 2, 10));
    }

    /**
     * Prints week day names in given language.
     * 
     * @param localId
     */
    private static String getWeekDayOfGivenDate(int year, int month, int day) {
        YearMonth date = YearMonth.of(year, month);

        return date.atDay(day).getDayOfWeek().name();
    }
}