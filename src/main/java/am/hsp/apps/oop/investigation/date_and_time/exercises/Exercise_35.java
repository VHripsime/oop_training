package main.java.am.hsp.apps.oop.investigation.date_and_time.exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to extract date, time from the date string.
 * 
 * @author user
 *
 */
public class Exercise_35 {

    public static void main(String[] args) {

        try {
            System.out.println(getExtractedDateAndTime("2019-02-10 09:00:02"));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the date and time froom the given string input.
     * 
     * @param dateAndTime
     * @return
     * @throws ParseException
     */
    private static String getExtractedDateAndTime(String dateAndTime) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateAndTime);
        String extractedDateAndTime = new SimpleDateFormat("dd/MM/yyyy, H:mm:ss").format(date);

        return extractedDateAndTime;
    }
}
