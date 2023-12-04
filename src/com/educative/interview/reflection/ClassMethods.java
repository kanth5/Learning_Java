package com.educative.interview.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

class ClassMethods {
    public static void main(String args[]) {
        try {
            String className = "java.lang.String";
            Class<?> c = Class.forName(className);
            System.out.println("\n\n\n");
            System.out.format("Class:%n  %s%n%n", c.getCanonicalName());

            Package p = c.getPackage();
            System.out.println("\n\n\n");
            System.out.format("Package:%n  %s%n%n", (p != null ? p.getName() : "Class not defined under a package"));

            System.out.println("\n\n\n");
            printMembers(c.getConstructors(), "Constuctors");
            System.out.println("\n\n\n");
            printMembers(c.getFields(), "Fields");
            System.out.println("\n\n\n");
            printMembers(c.getMethods(), "Methods");
            printClasses(c);

            // production code should handle these exceptions more gracefully
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        }
    }

    private static void printMembers(Member[] mbrs, String s) {
        System.out.format("%s:%n", s);
        for (Member mbr : mbrs) {
            if (mbr instanceof Field)
                System.out.format("  %s%n", ((Field) mbr).toGenericString());
            else if (mbr instanceof Constructor)
                System.out.format("  %s%n", ((Constructor) mbr).toGenericString());
            else if (mbr instanceof Method)
                System.out.format("  %s%n", ((Method) mbr).toGenericString());
        }
        if (mbrs.length == 0)
            System.out.format("  -- No %s --%n", s);
        System.out.format("%n");
    }

    private static void printClasses(Class<?> c) {
        System.out.format("Classes:%n");
        Class<?>[] clss = c.getClasses();
        for (Class<?> cls : clss)
            System.out.format("  %s%n", cls.getCanonicalName());
        if (clss.length == 0)
            System.out.format("  -- No member interfaces, classes, or enums --%n");
        System.out.format("%n");
    }

}