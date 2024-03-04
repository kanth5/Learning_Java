package com.educative.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// If a class does not override both the hashcode() and equals() method, then it will break the contract and the
// HashMap may not work. This class overrides the hashcode() method but does not override the equals() method.
// Ideally, two objects are considered equal if their empId is equal.

// Now we will create two Employee objects with the same empId and empName. We will also create a HashMap where the
// key will be the Employee object, and the value will be the salary. The HashMap should not allow both the Employee
// objects to be inserted as they are equal.

// On running the above program, we can see that both the Employee objects got inserted in the HashMap. The reason is
// that since we have not overridden the equals() method, the equals() method of the Object class is called because
// Object is the superclass of all the classes.

// As we can see, it compares two reference points to the same object. Since we have created two separate Employee
// objects, the equality check failed and both the objects were saved.

// If we had the equals method as well comparing on empId then the second object insertion into the HaspMap would have failed,
// preserving the contract of HashMap.

public class HashMapBadKeyDemo {

    public static void main(String args[]) {

        Employee1 emp1 = new Employee1(123, "Jane");
        Employee1 emp2 = new Employee1(123, "Jane");

        Map<Employee1, Integer> employeeMap = new HashMap<>();

        employeeMap.put(emp1, 56000);
        employeeMap.put(emp2, 45000);

        for (Entry<Employee1, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee Id: " + entry.getKey().empId + " Employee Name: " + entry.getKey().empName + " Salary "
                    + entry.getValue());
        }

    }
}

class Employee1 {

    int empId;
    String empName;

    public Employee1(int empId, String empName) {
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

//    @Override
//    public boolean equals(Object obj) {
//        Employee1 emp1 = (Employee1)obj;
//        return this.empId == emp1.empId;
//    }

}