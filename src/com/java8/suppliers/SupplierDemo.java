package com.java8.suppliers;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

    static boolean isPersonEligibleForVoting(
            Supplier<Person> supplier, Predicate<Person> predicate) {
        return predicate.test(supplier.get());
    }

    public static void main(String args[]) {
        Supplier<Person> supplier = () -> new Person("Alex", 23);
        Predicate<Person> predicate = (p) -> p.age > 18;
        boolean eligible =
                isPersonEligibleForVoting(supplier, predicate);
        System.out.println("Person is eligible for voting: " + eligible);

        IntSupplier intSupplier = () -> (int)(Math.random() * 10);

        System.out.println(intSupplier.getAsInt());

        DoubleSupplier doubleSupplier = () -> (int)(Math.random() * 10);

        System.out.println(doubleSupplier.getAsDouble());
    }

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}