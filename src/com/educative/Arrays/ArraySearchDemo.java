package com.educative.Arrays;

import java.util.Arrays;

public class ArraySearchDemo {

    public static void main(String args[]) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index of element 4 in the array is " + index);

        index = Arrays.binarySearch(numbers, 5, 9, 4);

        System.out.println("The index of element 4 in the array is " + index);

        index = Arrays.binarySearch(numbers, 1, 5, 4);

        System.out.println("The index of element 4 in the array is " + index);

        Employee[] employees = { new Employee(123, "Jay"),
                new Employee(124, "Roy"),
                new Employee(125, "Nikki"),
                new Employee(126, "Tom") };

        index = Arrays.binarySearch(employees, new Employee(124, "Roy"), (emp1, emp2) -> emp1.empId - emp2.empId);

        System.out.println("The index of employee object in the array is " + index);

    }

}
