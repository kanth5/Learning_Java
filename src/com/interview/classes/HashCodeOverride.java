package com.interview.classes;

import java.util.HashSet;
        import java.util.Random;
        import java.util.Set;

class HashCodeOverride {
    public static void main( String args[] ) {
        Set<FancyType> set = new HashSet<>();
        FancyType ft = new FancyType();

        set.add(ft);

        int count = 0;
        // Try to find the object in the set 100 times
        for (int i = 0; i < 100; i++) {
            if (!set.contains(ft)) {
                count++;
            }
        }
        System.out.println("Not found in set " + count + " times.");
    }
}

class FancyType {

    static Random random = new Random(System.currentTimeMillis());

    // Incorrectly overriding the hashCode method. If this is commented, then above object will be found always
    @Override
    public int hashCode() {
        return random.nextInt() % 2;
    }

}