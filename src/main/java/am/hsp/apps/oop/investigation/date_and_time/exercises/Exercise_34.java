package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.util.Calendar;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get today's date at midnight time.
 * 
 * @author user
 *
 */
public class Exercise_34 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();        
        calendar.set(Calendar.HOUR_OF_DAY, 0); 
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        
        System.out.println(calendar.getTime());
    }
}
