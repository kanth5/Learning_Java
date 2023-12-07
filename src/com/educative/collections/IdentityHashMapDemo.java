package com.educative.collections;

// IdentityHashMap is another type of Map that implements Map, Serializable, and Cloneable interfaces and extends the AbstractMap class. The main feature
// of this map is that while storing elements, the equality of the keys is checked on the basis of reference instead of the equals method. What this means
// is that if we have two keys, key1 and key2, then key1 will be considered equal to key2 if key1 == key2. In other words, if both the keys reference the
// same object. This means that IdentityHashMap intentionally violates Map’s general contract which mandates the use of the equals method when comparing
// objects. This class is designed for use only in rare cases wherein reference-equality semantics are required.

// IdentityHashMap uses reference equality to compare keys and values while HashMap uses object equality to compare keys and values.
// IdentityHashMap does not use the hashCode() method. Instead it uses System.identityHashCode() to find the bucket location.
// IdentityHashMap does not require keys to be immutable as it does not rely on the equals() and hashCode() methods. To safely store the object in HashMap,
// keys must be immutable.
// The default initial capacity of HashMap is 16; whereas, for IdentityHashMap, it is 32.

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {


    public static void main(String args[]) {

        Employee3 emp1 = new Employee3(123, "Saurav");
        Employee3 emp2 = new Employee3(123, "Saurav");

        Map<Employee3, String> hashMap = new HashMap<>();
        hashMap.put(emp1, "emp1");
        hashMap.put(emp2, "emp2");

        Map<Employee3, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(emp1, "emp1");
        identityHashMap.put(emp2, "emp2");

        System.out.println("The employee objects in HashMap are:");
        System.out.println(hashMap);

        System.out.println();
        System.out.println("The employee objects in IdentityHashMap are:");
        System.out.println(identityHashMap);

    }

}

class Employee3 {

    int empId;
    String empName;

    public Employee3(int empId, String empName) {
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
        Employee3 other = (Employee3) obj;
        if (empId != other.empId)
            return false;
        if (empName == null) {
            if (other.empName != null)
                return false;
        } else if (!empName.equals(other.empName))
            return false;
        return true;
    }

}