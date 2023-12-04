package com.educative.interview.classes;

import java.util.HashSet;

class EqualsDemo {

    @SuppressWarnings("unchecked")
    public static void main( String args[] ) {

        HashSet<Celebrity> set = new HashSet();
        Celebrity realKardashian = new Celebrity("Kim", 17);
        Celebrity kardashianClone = new Celebrity("Kim", 17);
        set.add(realKardashian);
//        set.add(kardashianClone);

        if (set.contains(kardashianClone)) {
            System.out.println("Kim is a celebrity");
        } else {
            System.out.println("Can't find Kim");
        }

        // equals method is overridden

        System.out.println(realKardashian.equals(kardashianClone));
        System.out.println(realKardashian.hashCode() + " " +kardashianClone.hashCode());

        System.out.println("-----");
        System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));
    }
}

class Celebrity {

    String name;
    int age;

    public Celebrity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Celebrity) || obj == null)
            return false;

        Celebrity otherCeleb = (Celebrity) obj;
        return name.equals(otherCeleb.name);
    }
}