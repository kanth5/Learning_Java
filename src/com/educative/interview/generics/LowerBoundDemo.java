package com.educative.interview.generics;

import java.util.*;

class LowerBoundDemo {

    public static void main(String args[]) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal());
        animals.add(new Tiger());

        // The method is able to accept a list of superclass of Tiger
        processAnimals(animals);

        // uncommenting the line below will show a compile error
        // unableToProcessAnimals(animals);
    }

    static void processAnimals(List<? super Tiger> list) {

        list.forEach(System.out::println);

        Iterator<Animal> itr = (Iterator<Animal>) list.iterator();

        itr.forEachRemaining(Animal::speakUp);
    }

    static void unableToProcessAnimals(List<Tiger> list) {
        // Your awesome code here
    }
}