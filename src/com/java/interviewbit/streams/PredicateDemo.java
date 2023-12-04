package com.java.interviewbit.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = getEmployeesFromDataSource();

        //filter 1
        Predicate<Employee> isEmployeeActive = e -> e.getStatus() == EmployeeStatus.ACTIVE;

        //filter2
        Predicate<Employee> isAccountActive = e -> e.getAccount().getStatus() == AccountStatus.ACTIVE;

        //Active employees
        String result = employeeList.stream()
                .filter(isEmployeeActive)
                .map(e -> ((Long)e.getId()).toString())
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println("Active employees = " + result);

        //Active employees with active accounts
        result = employeeList.stream()
                .filter(isEmployeeActive.and(isAccountActive))
                .map(e -> ((Long)e.getId()).toString())
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println("Active employees with active accounts = " + result);

        //Active employees with inactive accounts
        result = employeeList.stream()
                .filter(isEmployeeActive.and(isAccountActive.negate()))
                .map(e -> ((Long)e.getId()).toString())
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println("Active employees with inactive accounts = " + result);

        //Inactive employees with inactive accounts
        result = employeeList.stream()
                .filter(isEmployeeActive.negate().and(isAccountActive.negate()))
                .map(e -> ((Long)e.getId()).toString())
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println("Inactive employees with inactive accounts = " + result);

        System.out.println("count of male and female : ");

//        Map<String, Integer> employeeSummary = employeeList.stream()
//                .map(Employee::getGender)
//                .collect(Collectors.toMap(Function.identity(),v->1,Integer::sum));

        Map<String, Integer> employeeSummary = employeeList.stream()
                .map(Employee::getGender)
                .collect(Collectors.toMap(k-> {
                    System.out.println(k);
                    return k;
                },v->1,Integer::sum));

        System.out.println(employeeSummary);

        //Name and Address

        Map<String, String> employeeNameAddress = employeeList.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getAddress, (n,a)->(n + ": " + a)));

        System.out.println(employeeNameAddress);
    }

    private static List<Employee> getEmployeesFromDataSource() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1L, "A", "AA", "Male", EmployeeStatus.ACTIVE,
                new Account(1001L, "Saving - 1001", "Saving", AccountStatus.ACTIVE)));
        employeeList.add(new Employee(2L, "B", "BB", "Male", EmployeeStatus.ACTIVE,
                new Account(1002L, "Checking - 1002", "Checking", AccountStatus.ACTIVE)));
        employeeList.add(new Employee(3L, "C", "CC", "Female", EmployeeStatus.ACTIVE,
                new Account(1003L, "Deposit - 1003", "Deposit", AccountStatus.ACTIVE)));
        employeeList.add(new Employee(4L, "D", "DD", "Male", EmployeeStatus.ACTIVE,
                new Account(1004L, "Saving - 1004", "Saving", AccountStatus.INACTIVE)));
        employeeList.add(new Employee(5L, "E", "EE", "Female", EmployeeStatus.ACTIVE,
                new Account(1005L, "Checking - 1005", "Checking", AccountStatus.INACTIVE)));
        employeeList.add(new Employee(6L, "F", "FF", "Female", EmployeeStatus.ACTIVE,
                new Account(1006L, "Deposit - 1006", "Deposit", AccountStatus.BLOCKED)));

        employeeList.add(new Employee(7L, "A", "AAAA", "Male", EmployeeStatus.ACTIVE,
                new Account(1007L, "Saving - 1007", "Saving", AccountStatus.ACTIVE)));

        return employeeList;
    }
}

enum EmployeeStatus {ACTIVE, INACTIVE};

class Employee {
    private long id;
    private String name;
    private String address;
    private String gender;

    private Account account;

    public Employee(long id, String name, String address, String gender, EmployeeStatus employeeStatus, Account account) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.employeeStatus = employeeStatus;
        this.account = account;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public Account getAccount() {
        return account;
    }

    public EmployeeStatus getStatus() {
        return employeeStatus;
    }

    private EmployeeStatus employeeStatus;

}

enum AccountStatus {ACTIVE, INACTIVE, BLOCKED};
class Account {
    private long accountNumber;
    private String accountName;

    private String accountType;

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public AccountStatus getStatus() {
        return accountStatus;
    }

    private AccountStatus accountStatus;

    public Account(long accountNumber, String accountName, String accountType, AccountStatus accountStatus) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
    }

}