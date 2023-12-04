package com.educative.java8.predicates;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

    // Single Predicate

    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }

    static boolean isPersonEligibleForMembership(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }

    static boolean isPersonEligibleForRetirement(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }

    static boolean isNumberLessThanTen(Predicate<Integer> predicate){
        return predicate.negate().test(14);
    }

    // Bi-Predicate takes in 2 objects for the predicate

    static boolean isPersonEligibleForVoting(
            Person person, Integer minAge, BiPredicate<Person, Integer> predicate) {
        return predicate.test(person, minAge);
    }

    public static void main (String args[]){

        Person person = new Person("Alex", 23, 24);

        // Created a predicate. It returns true if age is greater than 18.
        Predicate<Person> predicate1 = p -> p.age > 18;

        boolean eligible1 = isPersonEligibleForVoting(person , predicate1);

        System.out.println("Person is eligible for voting: " + eligible1);

        // Created a predicate. It returns true if age is greater than 18.
        Predicate<Person> greaterThanEighteen = (p) -> p.age > 18;

        // Created a predicate. It returns true if age is less than 60.
        Predicate<Person> lessThanSixty = (p) -> p.age < 60;

        Predicate<Person> predicate2 = greaterThanEighteen.and(lessThanSixty);

        boolean eligible2 = isPersonEligibleForMembership(person , predicate2);
        System.out.println("Person is eligible for membership: " + eligible2);

        // Created a predicate. It returns true if age is greater than 60.
        Predicate<Person> greaterThanSixty = (p) -> p.age > 60;

        // Created a predicate. It returns true if year of service is greater than 30.
        Predicate<Person> serviceMoreThanThirty = (p) -> p.yearsOfService > 30;

        Predicate<Person> predicate3 = greaterThanSixty.or(serviceMoreThanThirty);

        boolean eligible3 = isPersonEligibleForRetirement(person , predicate3);
        System.out.println("Person is eligible for retirement: " + eligible3);

        Predicate<Integer> numberGreaterThanTen = p -> p > 10;

        boolean isLessThanTen = isNumberLessThanTen( numberGreaterThanTen);
        System.out.println("Is number less than ten: " + isLessThanTen);

        Predicate<String> predicate4  = Predicate.isEqual("Hello");

        // The same thing can be achieved by below lambda.
        // Predicate<String> predicate  = p -> p.equals("Hello");

        System.out.println(predicate4.test("Welcome"));

        // Bi-Predicate

        boolean eligible =
                isPersonEligibleForVoting(
                        person,
                        28,
                        (p, minAge) -> {
                            return p.age > minAge;
                        });
        System.out.println("Person is eligible for voting: " + eligible);
    }
}

class Person {
    String name;
    int age;
    int yearsOfService;
    Person(String name, int age, int yearsOfService){
        this.name = name;
        this.age = age;
        this.yearsOfService = yearsOfService;
    }
}