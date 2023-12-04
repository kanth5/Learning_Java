package com.java.interviewbit;

public class Constructor {

    public static void main(String[] args) {

        Person p1 = new Person("Jack", 25);
        Person p2 = new Person(p1);
        Person p3;

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());

    }
}

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
}