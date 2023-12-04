package com.java8.DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

    public static void main(String[] args) {

        Period period = Period.ofDays(5);  // Period of 5 days.
        System.out.println(period.getDays());

        period = Period.ofMonths(3);  // Period of 3 months.
        System.out.println(period.getMonths());

        period = Period.ofYears(2);  // Period of 2 Years
        System.out.println(period.getYears());

        period = Period.of(2, 5, 12); // Period of 2 Years, 5 Months and 12 Days.
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        Period period2 = Period.between(LocalDate.parse("2020-05-18"), LocalDate.parse("2017-04-17"));

        System.out.println(period2);

        Period period3 = Period.between(LocalDate.parse("2017-04-17"), LocalDate.parse("2020-05-18"));

        int years = period3.getYears();
        int months = period3.getMonths();
        int days = period3.getDays();

        System.out.println("The difference between two dates is " + years + " Years, " + months + " Months and " + days + " Days");
    }
}
