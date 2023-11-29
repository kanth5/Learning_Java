package com.java.softwaretesting;

public class GenericInterface {
    public static void main(String args[]) {
        //create int and char type arrays
        Integer[] intArray = {13, 36, 22, 18, 26};
        Character[] charArray = {'S', 's', 'V', 'w', 'p', 'R'};
        //Create objects of type MinClassImpl with integer and character data types
        MinClassImpl<Integer> intMinValue = new MinClassImpl<Integer>(intArray);
        MinClassImpl<Character> charMinValue = new MinClassImpl<Character>(charArray);

        //call interface method minValue for int type array
        System.out.println("Min value in intOfArray: " + intMinValue.minValue());
        //call interface method minValue for char type array
        System.out.println("Min value in charOfArray: " + charMinValue.minValue());
    }
}

//generic interface declaration
interface MinInterface<T extends Comparable<T>> {
    T minValue();
}

//implementation for generic interface
class MinClassImpl<T extends Comparable<T>> implements MinInterface<T> {
    T[] intArray;

    MinClassImpl(T[] o) {
        intArray = o;
    }

    public T minValue() {
        T v = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i].compareTo(v) < 0) {
                v = intArray[i];
            }
        }
        return v;
    }
}
