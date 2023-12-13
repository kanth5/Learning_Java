package com.educative.interview.generics;

import java.util.ArrayList;
import java.util.Collection;

class UpperBoundDemo {
    public static void main(String args[]) {
        Collection<Tiger> tigers = new ArrayList<>();
        tigers.add(new Tiger());
        printAnimal(tigers);

        // printAnimalWithoutWildCard(tigers);     // Without wildcard, we can only pass Collection<Animal>

        Collection<Animal> animals = new ArrayList<>();

        animals.add(new Tiger());
        animals.add(new Elephant());
        printAnimalWithoutWildCard(animals);
    }

    static void printAnimal(Collection<? extends Animal> animals) {
        for (Animal animal : animals)
            animal.speakUp();
    }

    // The wildcard is bounded by type Animal but the entire type parameter for the collection parameter
    // will be dropped resulting in:

//    static void printAnimal(Collection animals) {
//        for (Animal animal : animals)
//            animal.speakUp();
//    }

    // The below method will also work as they have the same signature after erasure

//    static <T extends Animal> void printAnimalWithoutWildCard(Collection<T> animals) {
//        for (Animal animal : animals)
//            animal.speakUp();
//    }

    // The type parameter T is replaced by its first bound which is Animal and the collection parameter
    // will drop its type parameter resulting in:

//    static void printAnimal(Collection animals) {
//        for (Animal animal : animals)
//            animal.speakUp();
//    }

    static void printAnimalWithoutWildCard(Collection<Animal> animals) {
        for (Animal animal : animals)
            animal.speakUp();
    }


}


