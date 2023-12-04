package com.java8.DateTimeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        // of(int hour, int minute)
        LocalTime time1 = LocalTime.of(11, 25);
        System.out.println(time1);

        // of(int hour, int minute, int second)
        time1 = LocalTime.of(11, 25, 03);
        System.out.println(time1);

        // of(int hour, int minute, int second, int nanoOfSecond)
        time1 = LocalTime.of(11, 25, 04, 323);
        System.out.println(time1);

        // parse(CharSequence text)
        LocalTime time2 = LocalTime.parse("08:27");
        System.out.println(time2);

        // parse(CharSequence text, DateTimeFormatter formatter)
        time2 = LocalTime.parse("08:27", DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(time2);

        // Adding 4 seconds to the given time.
        LocalTime time3 = LocalTime.parse("12:54:53").plusSeconds(4);
        System.out.println(time3);

        // Adding 10 minutes to the given time.
        time3 = LocalTime.parse("12:54:53").plusMinutes(10);
        System.out.println(time3);

        // Adding 2 hours to the given time.
        time3 = LocalTime.parse("12:54:53").plusHours(2);
        System.out.println(time3);

        // Adding 4 minutes to the given time.
        time3 = LocalTime.parse("12:54:53").plus(4, ChronoUnit.MINUTES);
        System.out.println(time3);

        int minute = LocalTime.parse("07:45").getMinute();

        System.out.println(minute);

        boolean isBefore = LocalTime.parse("06:23")
                .isBefore(LocalTime.parse("07:50"));
        System.out.println(isBefore);

        boolean isAfter = LocalTime.parse("06:23")
                .isAfter(LocalTime.parse("07:50"));
        System.out.println(isAfter);

    }

}
