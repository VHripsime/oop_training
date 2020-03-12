package main.java.am.hsp.apps.oop.investigation.date_and_time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * GregorianCalendar is a concrete implementation of a Calendar. The
 * getInstance() method of Calendar will typically return a GregorianCalendar
 * initialized with the current date and time in the default locale and time
 * zone.
 * 
 * @author user
 *
 */
public class GregorianCalendarDemo {

    public static void main(String[] args) {

//        GregorianCalendar calendar = new GregorianCalendar();
//
//        System.out.println("The calendar type is: " + calendar.getCalendarType());
//        System.out.print("\nDate: ");
//        System.out.println(calendar.get(Calendar.DATE) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/"
//                + calendar.get(Calendar.YEAR));
//        System.out.print("Time: ");
//        System.out.print(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
//                + calendar.get(Calendar.SECOND));
//        System.out.println();
//
//        printWhetherLeapYear(calendar);
    	
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(LocalDateTime.now()));
    }

    /**
     * Prints whether the year is leap or not.
     * 
     * @param calendar
     */
    private static void printWhetherLeapYear(GregorianCalendar calendar) {
        int year = calendar.get(Calendar.YEAR);

        if (calendar.isLeapYear(year)) {
            System.out.println("The current year is a leap year");
        } else {
            System.out.println("The current year is not a leap year");
        }
    }
}
