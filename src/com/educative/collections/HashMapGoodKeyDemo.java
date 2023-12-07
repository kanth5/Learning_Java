package com.educative.collections;

import java.util.HashMap;
import java.util.Map;

// It is not mandatory for a HashMap key to be immutable, but it is suggested that key objects are immutable.
// Immutability allows us to get the same hash code every time for a key object. All the wrapper classes such
// as String, Integer, etc., are immutable, so they are considered good key candidates.

// In the below example, we are using an Employee object as a key. After inserting the employee object into
// the HashMap, we will make a change in the Employee object. After that, we will try to get the value for
// this key from the HashMap.

// When we run the below program, null is returned. The reason is when we change the Employee object its hashcode
// also changes. Therefore, when we try to search for the Employee object, a different bucket is returned. So,
// although the object was present in the HashMap, it is not returned.

public class HashMapGoodKeyDemo {

    public static void main(String args[]) {

        Employee2 emp1 = new Employee2(123, "Jane");

        Map<Employee2, Integer> employeeMap = new HashMap<>();

        employeeMap.put(emp1, 56000);

        System.out.println(employeeMap.get(emp1));

        emp1.empName = "Alex";

        System.out.println(employeeMap.get(emp1));

    }
}

class Employee2 {

    int empId;
    String empName;

    public Employee2(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empId;
        result = prime * result + ((empName == null) ? 0 : empName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Employee2 emp = (Employee2) obj;
        return this.empId == emp.empId;
    }

}