package main.java.am.hsp.apps.oop.investigation.date_and_time;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period class represents a number of days, months or years.
 * 
 * @author user
 *
 */
public class PeriodsDemo {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2019, 1, 20);
        LocalDate end = LocalDate.of(2019, 5, 20);
        System.out.println(Period.between(start, end));
        Period period = Period.ofMonths(1);

        performStartOfHolidays(start, end, period);

        Period annually = Period.ofYears(1);
        System.out.println(annually);

        Period quarterly = Period.ofMonths(3);
        System.out.println(quarterly);

        /*
         * Week is not a unit Period stores. Therefore, a week is converted into
         * days.
         */
        Period everyGivenWeeks = Period.ofWeeks(3);
        System.out.println(everyGivenWeeks);

        Period everyGivenDays = Period.ofDays(2);
        System.out.println(everyGivenDays);

        Period everyGivenYearAndDay = Period.of(1, 0, 7);
        System.out.println(everyGivenYearAndDay);
    }

    /**
     * Adds given period to the given start date until it hits the end.
     * 
     * @param start
     * @param end
     * @param period
     */

    private static void performStartOfHolidays(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;

        while (upTo.isBefore(end)) {
            System.out.println("Summer holidays haven't started yet: " + upTo);
            upTo = upTo.plus(period);
        }

        System.out.println("They are finally started! " + upTo);
    }
}
