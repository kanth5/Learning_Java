package com.interview.methods;

import java.util.*;

class MethodDesign {
    public static void main( String args[] ) {
        List<String> keys = Arrays.asList("A", "B", "C");

        // Broken
        DefensiveClass defensiveClass = new DefensiveClass(keys);
        defensiveClass.printKeys();
//        ((List<String>) keys).set(0, "Z");
        keys.set(0, "Z");
        defensiveClass.printKeys();
        System.out.println("\n\n\n");
//        ((List<String>) keys).set(0, "A");
        keys.set(0, "A");

        // Fixed
        DefensiveClassFixed defensiveClassFixed = new DefensiveClassFixed(keys);
        defensiveClassFixed.printKeys();
        keys.set(0, "Z");
        defensiveClassFixed.printKeys();
    }
}

class DefensiveClassFixed {

    List<String> cryptoKeys;

    DefensiveClassFixed(List<String> cryptoKeys) {
        this.cryptoKeys = new ArrayList<>(cryptoKeys.size());

        // Make a copy of the passed-in list. Remember to make
        // a deep copy if a list of objects is passed-in
        for (String key : cryptoKeys)
            this.cryptoKeys.add(key);
    }

    void printKeys() {
        for (String key : cryptoKeys) {
            System.out.println(key);
        }
    }
}

class DefensiveClass {

    List<String> cryptoKeys;

    // Bad design!
    DefensiveClass(List<String> cryptoKeys) {
        this.cryptoKeys = cryptoKeys;
    }

    void printKeys() {
        for (String key : cryptoKeys) {
            System.out.println(key);
        }
    }
}