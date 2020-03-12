package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.util.Calendar;
import java.util.Date;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get the last date of the month.
 * 
 * @author user
 *
 */
public class Exercise_8 {

    public static void main(String[] args) {

        System.out.println(getLastDateOfMonth());
    }

    /**
     * Returns the date of the month's last day.
     * 
     * @return
     */
    private static Date getLastDateOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, getLastDayOfMonth(calendar));

        return calendar.getTime();
    }

    /**
     * Returns the last day of the current month.
     * 
     * @param calendar
     * @return
     */
    private static int getLastDayOfMonth(Calendar calendar) {
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}