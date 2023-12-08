package com.educative.Arrays;

import java.util.Arrays;

public class ArrayCopyDemo {

    public static void main(String args[]) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] newArray = Arrays.copyOf(numbers, numbers.length);

        System.out.println("The copied array is: ");

        for (int i : newArray) {
            System.out.print(i + " ");
        }

        int[] newArrayBiggerSize = Arrays.copyOf(numbers, 20);
        System.out.println();
        System.out.println("The copied array is: ");

        for (int i : newArrayBiggerSize) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] newArray1 = Arrays.copyOfRange(numbers, 0, 5);

        System.out.println("The copied array 1 is: ");

        for (int i : newArray1) {
            System.out.println(i);
        }

        // Creating an Array of Employee objects.
        Employee[] employees = { new Employee(123, "Jay"), new Employee(124, "Ryan") };

        // Creating the copy of Array.
        Employee[] copiedArray = Arrays.copyOf(employees, 2);

        // Changing the name of first employee in original array.
        employees[0] = new Employee(123, "Changed Name");

        // Printing the name of first employee in original array.
        System.out.println(employees[0].empName);

        // Printing the name of first employee in copied array.
        System.out.println(copiedArray[0].empName);

        // the copyOf() method creates a deep copy of objects instead of just changing the references.
    }
}

