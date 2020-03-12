package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.time.YearMonth;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get the name of the first and last day of a month.
 * 
 * @author user
 *
 */
public class Exercise_10 {

    public static void main(String[] args) {

        System.out.println(getGivenDayOfGivenMonth(2019, 2, 1));
        System.out.println(getLastDayOfGivenMonth(2019, 2));
    }

    /**
     * Returns the specified day name of the given month.
     * 
     * @return
     */
    private static String getGivenDayOfGivenMonth(int year, int month, int day) {
        YearMonth date = YearMonth.of(year, month);

        return date.atDay(day).getDayOfWeek().name();
    }

    /**
     * Returns the last day name of the given month.
     * 
     * @return
     */
    private static String getLastDayOfGivenMonth(int year, int month) {
        YearMonth date = YearMonth.of(year, month);

        return date.atEndOfMonth().getDayOfWeek().name();
    }
}
