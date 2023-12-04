package com.java8.DateTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // of(int year, int month, int dayOfMonth, int hour, int minute)
        LocalDateTime date1 = LocalDateTime.of(2019, 05, 03, 12, 34);
        System.out.println(date1);

        // of(int year, int month, int dayOfMonth, int hour, int minute, int second)
        date1 = LocalDateTime.of(2019, Month.AUGUST, 03, 23, 34);
        System.out.println(date1);

        // parse(CharSequence text)
        LocalDateTime date2 = LocalDateTime.parse("2020-06-20T07:54:00");
        System.out.println(date2);

        // Adding 4 days to given date and time.
        LocalDateTime date3 = LocalDateTime.parse("2020-05-12T08:30:00").plusDays(4);
        System.out.println(date3);

        // Adding 4 months to given date and time.
        date3 = LocalDateTime.parse("2020-05-12T08:30:00").plus(4, ChronoUnit.MONTHS);
        System.out.println(date3);

        // Subtracting 4 months from given date and time.
        date3 = LocalDateTime.parse("2020-05-12T08:30:00").minusMonths(4);
        System.out.println(date3);

    }
}
