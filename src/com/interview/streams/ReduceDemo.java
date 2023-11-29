package com.interview.streams;

import java.util.*;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        list.add(new Employee1("Dave", 23, 20000));
        list.add(new Employee1("Joe", 18, 40000));
        list.add(new Employee1("Ryan", 54, 100000));
        list.add(new Employee1("Iyan", 5, 34000));
        list.add(new Employee1("Ray", 63, 54000));

        // reduce(BinaryOperator<T> accumulator)

        // This method takes a binary operator as an input and returns an Optional that describes the reduced value.

        Optional<Integer> totalSalary = list.stream()
                .map(p -> p.getSalary())  //We are converting the Stream of Employees to Stream of salaries.
                .reduce((p, q) -> p + q);

        if (totalSalary.isPresent()) {
            System.out.println("The total salary is " + totalSalary.get());
        }

        // another way is to use an integer stream and the sum method on it

        int totalSalaryNew = list.stream()
                .mapToInt(p->p.getSalary())
                .sum();

        System.out.println("Total New Salary is : " + totalSalaryNew);

        // T reduce(T identity, BinaryOperator<T> accumulator)

        // this method “performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function,
        // and returns the reduced value.”

        // This method has an extra ‘identity’ parameter. It is the initial value of reduction. It is the default result of reduction if there are no elements in
        // the stream. That’s the reason, this version of the reduce method doesn’t return Optional because it would at least return the identity element.

        int totalSalaryAnother = list.stream()
                .map(p->p.getSalary())
                .reduce(5,(partialSum, num) -> partialSum+num);

        System.out.println("Total Salary Another : " + totalSalaryAnother);

        List<Integer> numlist = Arrays.asList(1,2,3,4,5,6);

        // <U> U reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner)

        // this method performs a reduction on the elements of this stream, using the provided identity, accumulation and combining functions.
        // If we are using a parallel stream, then the Java runtime splits the stream into multiple sub-streams. In such cases, we need to use a function to
        // combine the results of the sub-streams into a single one. This is done by a combiner.

        int totalSum = numlist.parallelStream()
                .reduce(0,(partialSum, num)->partialSum+num, Integer::sum);

        System.out.println("Total Sum is : " + totalSum);

        // max and min functions

        Optional<Integer> max = numlist.stream()
                .max(Comparator.naturalOrder());

        Optional<Integer> min = numlist.stream()
                .min(Comparator.naturalOrder());

        System.out.println("Max and Min are : " + max + " " + min + " " + "respectively");

        Optional<Employee1> maxSalary = list.stream()
                .max(Comparator.comparing(p->p.getSalary()));

        System.out.println("Max Salary : " + maxSalary);

    }
}

class Employee1 {
    String name;
    int age;
    int salary;

    Employee1(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}