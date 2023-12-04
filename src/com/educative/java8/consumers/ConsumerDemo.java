package com.educative.java8.consumers;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello World.");

        Consumer<Integer> intConsumer = i -> System.out.println("Integer value = " + i);
        intConsumer.accept(5);

        Consumer<String> consumer1 = (arg) -> System.out.println(arg + "My name is Jane.");

        Consumer<String> consumer2 = (arg) -> System.out.println(arg + "I am from Canada.");

        consumer1.andThen(consumer2).accept("Hello. ");

        BiConsumer<String, String> greet = (s1, s2) -> System.out.println(s1 + s2);

        greet.accept("Hello", "World");
    }
}