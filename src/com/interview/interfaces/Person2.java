package com.interview.interfaces;

class Person2 implements Comparable<Person2> {
    private String name;
    private int age;
    private int height;

    public Person2(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public String toString() {
        return "Person2{name='" + this.name + "', age=" + this.age + ", height=" + this.height + "}";
    }

    public int compareTo(Person2 o) {
        if (o.getAge() > this.age) {
            return 1;
        } else {
            return o.getAge() < this.age ? -1 : 0;
        }
    }
}