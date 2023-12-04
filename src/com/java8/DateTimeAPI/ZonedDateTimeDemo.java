package com.java8.DateTimeAPI;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {

        //Fetching the Zoneid for given Zone.
        ZoneId zoneId = ZoneId.of("America/Marigot");
        System.out.println("Zone Id " + zoneId);

        //Fetching a Set of all Zoneids
        Set<String> zoneIdList = ZoneId.getAvailableZoneIds();

//        for (String zone : zoneIdList) {
//            System.out.println(zone);
//        }

        // Fetching the current TimeZone
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        // fetching the ZoneId for Canada/Atlantic
        ZoneId zoneId1 = ZoneId.of("Canada/Atlantic");

        zonedDateTime1 =
                ZonedDateTime.of(2020, 10, 15, 23, 45, 59, 1234, zoneId1);
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.now();

        int year = zonedDateTime2.getYear();
        System.out.println("Year is: " + year);

        Month month = zonedDateTime2.getMonth();
        System.out.println("Month is: " + year);

        int dayOfMonth = zonedDateTime2.getDayOfMonth();
        System.out.println("Day Of Month is: " + dayOfMonth);

        DayOfWeek dayOfWeek = zonedDateTime2.getDayOfWeek();
        System.out.println("Day of week is: " + dayOfWeek);

        int dayOfYear = zonedDateTime2.getDayOfYear();
        System.out.println("Day of year is: " + dayOfYear);

        int hour = zonedDateTime2.getHour();
        System.out.println("Hour is: " + hour);

        int minute = zonedDateTime2.getMinute();
        System.out.println("Minute is: " + minute);

        int second = zonedDateTime2.getSecond();
        System.out.println("Second is: " + second);

        int nano = zonedDateTime2.getNano();
        System.out.println("Nano is: " + nano);

        ZonedDateTime zonedDateTime3 = ZonedDateTime.now();

        System.out.println("Date after adding Year is: " + zonedDateTime3.plusYears(1));

        System.out.println("Date after adding Month is: " + zonedDateTime3.plusMonths(1));

        System.out.println("Date after adding days is: " + zonedDateTime3.plusDays(15));

        System.out.println("Date after adding hours is: " + zonedDateTime3.plusHours(15));

        System.out.println("Date after adding minutes is: " + zonedDateTime3.plusMinutes(1));

        System.out.println("Date after adding seconds is: " + zonedDateTime3.plusSeconds(15));

        System.out.println("Date after adding nanoseconds is: " + zonedDateTime3.plusNanos(15));

        System.out.println("Date after subtracting Year is: " + zonedDateTime3.minusYears(1));

        System.out.println("Date after subtractng Month is: " + zonedDateTime3.minusMonths(1));

        System.out.println("Date after subtracting days is: " + zonedDateTime3.minusDays(15));

        System.out.println("Date after subtracting hours is: " + zonedDateTime3.minusHours(15));

        System.out.println("Date after subtracting minutes is: " + zonedDateTime3.minusMinutes(1));

        System.out.println("Date after subtracting seconds is: " + zonedDateTime3.minusSeconds(15));

        System.out.println("Date after subtracting nanoseconds is: " + zonedDateTime3.minusNanos(15));
    }
}
