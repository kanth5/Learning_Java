package com.educative.interview.reflection;

import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ClassInstantiationDemo {
    public static void main(String args[]) {
        usingConstructorNewInstance();
        System.out.println("\n\n\n");

        // Uncomment the below line and run to see how the
        // checked exception goes unhandled
        usingClassNewInstance();
    }

    static void usingClassNewInstance() {

        Class<?> c = EducativeCourse.class;

        // FileNotFoundException isn't handled, even
        // though the thrown exception is checked
        try {
            EducativeCourse ec = (EducativeCourse) c.newInstance();
        } catch (IllegalAccessException iae) {
            iae.printStackTrace();

        } catch (InstantiationException ie) {
            ie.printStackTrace();
        }
    }

    static void usingConstructorNewInstance() {

        Class<?> c = EducativeCourse.class;
        Constructor<?>[] ctrs = c.getConstructors();

        try {
            // There's a single constructor so we can index
            // at the first element
            ctrs[0].newInstance();
        } catch (IllegalAccessException iae) {

        } catch (InstantiationException ie) {

        } catch (InvocationTargetException ite) {
            // FileNotFoundException is caught
            System.out.println("\nCaught Exception\n");
            ite.printStackTrace();
        }
    }


}

// Hypothetical class
class EducativeCourse {

    private String title;
    private long likes;

    public EducativeCourse() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
