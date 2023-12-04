package com.educative.interview.boxunbox;

public class Demo {

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        Long value = 7L;
        System.out.println("\nLong value = 7L;\nvalue.equals(7) " + value.equals(7));
        System.out.println("value == 7 " + (value == 7));
        System.out.println("value.equals(7L) " + value.equals(7L));

        Long value1 = 7L;
        Long value2 = 7L;
        System.out.println("\n\nLong value1 = 7L;\nLong value2 = 7L;\nvalue1 == value2 " + (value1 == value2));
        System.out.println("value1.equals(value2) " + value1.equals(value2));

        value1 = 20007L;
        value2 = 20007L;

        System.out.println(value1.hashCode());
        System.out.println(value2.hashCode());
        System.out.println("\n\nvalue1 = 20007L;\nvalue2 = 20007L;\nvalue1 == 20007L " + (value1 == 20007L));
        System.out.println("value1 == value2 " + (value1 == value2));
        System.out.println("value1.equals(20007L) " + value1.equals(20007L));
    }
}
