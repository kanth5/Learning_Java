package com.java8.streams;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class CollectorsDemo3 {

    public static void main(String args[]) {

        List<Employee2> employeeList = new ArrayList<>();
        employeeList.add(new Employee2("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee2("Ben", 63, 25000, "China"));
        employeeList.add(new Employee2("Dave", 34, 56000, "India"));
        employeeList.add(new Employee2("Jodi", 43, 67000, "USA"));
        employeeList.add(new Employee2("Ryan", 53, 54000, "China"));

        // groupingBy(Function<? super T, ? extends K> classifier)

        // The employees are grouped by country using the groupingBy() method.
        Map<String, List<Employee2>> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry));

        System.out.println(employeeMap);

        // groupingBy(Function<? super T,? extends K> classifier, Collector<? super T,A,D> downstream)

        // This method takes an additional second collector, which is applied to the results of the first collector.

        Map<String, Set<Employee2>> employeeSet1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry, Collectors.toSet()));

        System.out.println(employeeSet1);

        // The employees are grouped by country and age by using the groupingBy() method twice.
        Map<String, Map<Integer,List<Employee2>>> employeeMap2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry, Collectors.groupingBy(Employee2::getAge)));

        System.out.println(employeeMap2);

        Set<Employee2> employeeSet = new HashSet<>();

        employeeSet.add(new Employee2("Alex", 23, 23000, "USA"));
        employeeSet.add(new Employee2("Ben", 63, 25000, "China"));
        employeeSet.add(new Employee2("Dave", 34, 56000, "India"));
        employeeSet.add(new Employee2("Jodi", 43, 67000, "USA"));
        employeeSet.add(new Employee2("Ryan", 53, 54000, "China"));

        // The employees are grouped by country. Even though the input collection is a Set, the output is still a list of objects

        Map<String, List<Employee2>> employeeMap3 = employeeSet.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry));

        System.out.println(employeeMap3);

        // Sum of salaries of all employees country wise

        Map<String, Integer> sumOfSalaryByCountry = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry,Collectors.summingInt(Employee2::getSalary)));

        System.out.println(sumOfSalaryByCountry);

        // Max salary by country

        Map<String, Optional<Employee2>> maxSalaryByCountry = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry , Collectors.maxBy(Comparator.comparingInt(Employee2::getSalary))));

        System.out.println(maxSalaryByCountry);

        // groupingBy(Function<? super T,? extends K> classifier, Supplier<M> mapFactory, Collector<? super T,A,D> downstream)

        Map<String, Set<Employee2>> employeeMap4 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry, HashMap::new , Collectors.toSet()));

        System.out.println(employeeMap4);

        // groupingByConcurrent(Function<? super T,? extends K> classifier)

        ConcurrentMap<String,List<Employee2>> employeeMap5 = employeeList.parallelStream()
                .collect(Collectors.groupingByConcurrent(Employee2::getCountry));

        System.out.println(employeeMap5);

        // Collectors.partitioningBy()

        Map<Boolean, List<Employee2>> employeeMap6 = employeeList.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));

        System.out.println(employeeMap6);

    }
}