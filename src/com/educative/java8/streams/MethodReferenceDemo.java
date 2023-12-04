package com.educative.java8.streams;


import java.util.ArrayList;
import java.util.List;

public class MethodReferenceDemo {

    public static int getLength1(String str) {
        return str.length();
    }

    public int getLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("word");
        list.add("practice");
        list.add("fake");

        // 1. Static Method Reference

        // Code without using method reference.
        list.stream()
                .mapToInt(str -> MethodReferenceDemo.getLength1(str))
                .forEach(System.out::println);

        // Code with method reference.
        list.stream()
                .mapToInt(MethodReferenceDemo::getLength1)
                .forEach(System.out::println);

        // 2. Instance Method Reference

        MethodReferenceDemo mrd = new MethodReferenceDemo();

        // Code without using method reference.
        list.stream()
                .mapToInt(str -> mrd.getLength(str))
                .forEach(System.out::println);

        // Code with method reference.
        list.stream()
                .mapToInt(mrd::getLength)
                .forEach(System.out::println);

        // 3. Instance method of an arbitrary object

        List<Employee> listE = new ArrayList<>();
        listE.add(new Employee("Dave", 23, 20000));
        listE.add(new Employee("Joe", 18, 40000));
        listE.add(new Employee("Ryan", 54, 100000));
        listE.add(new Employee("Iyan", 5, 34000));
        listE.add(new Employee("Ray", 63, 54000));

        // Code without using method reference
        int totalSalary1 = listE.stream()
                .mapToInt(emp -> emp.getSalary())
                .sum();

        // Code with method reference
        int totalSalary = listE.stream()
                .mapToInt(Employee::getSalary)
                .sum();

        System.out.println("The total salary is " + totalSalary);

        // 4. Constructor references

        List<String> listS = new ArrayList<>();
        listS.add("Dave");
        listS.add("Joe");
        listS.add("Ryan");
        listS.add("Iyan");
        listS.add("Ray");

        // Code without constructor reference
        listS.stream()
                .map(name -> new Employee(name))
                .forEach(System.out::println);

        // Code with constructor reference
        listS.stream()
                .map(Employee::new)
                .forEach(System.out::println);
    }
}

