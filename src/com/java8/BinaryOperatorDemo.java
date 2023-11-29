package com.java8;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

    public static void main(String args[]) {
        Person1 person1 = new Person1("Alex", 23);
        Person1 person2 = new Person1("Daniel", 56);
        BinaryOperator<Person1> operator = (p1, p2) -> {
            p1.name = p2.name;
            p1.age = p2.age;
            return p1;
        };

        operator.apply(person1, person2);
        System.out.println("Person Name: " + person1.getName() + " Person Age: " + person1.getAge());
    }
}

class Person1 {
    String name;
    int age;

    Person1() {
    }

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}