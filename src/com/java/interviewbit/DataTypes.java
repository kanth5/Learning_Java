package com.java.interviewbit;

public class DataTypes {

    public static void main(String[] args) {

        byte b = 'A';
        short s = 1;
        int i = 10;
        long l = 100L;

        float f = 3.14f;
        double d = 10;

        char c = 'A';
        boolean bl = true;

        System.out.println("byte : " + b + " Byte Size : " + Byte.SIZE);
        System.out.println("short : " + s + " Short Size : " + Short.SIZE);
        System.out.println("int : " + i + " Integer Size : " + Integer.SIZE);
        System.out.println("long : " + l + " Long Size : " + Long.SIZE);

        System.out.println("float : " + f + " Float Size : " + Float.SIZE);
        System.out.println("double : " + d + " Double Size : " + Double.SIZE);

        System.out.println("char : " + c + " Char Size : " + Character.SIZE);
//        System.out.println("boolean : " + bl + "Boolean Size : " + Boolean.SIZE);

        System.out.println("byte min : " + Byte.MIN_VALUE);
        System.out.println("byte max : " + Byte.MAX_VALUE);

        System.out.println("short min : " + Short.MIN_VALUE);
        System.out.println("short max : " + Short.MAX_VALUE);

        System.out.println("int min : " + Integer.MIN_VALUE);
        System.out.println("int max : " + Integer.MAX_VALUE);

        System.out.println("long min : " + Long.MIN_VALUE);
        System.out.println("long max: " + Long.MAX_VALUE);

        System.out.println("float min : " + Float.MIN_VALUE);
        System.out.println("float max : " + Float.MAX_VALUE);

        System.out.println("double min : " + Double.MIN_VALUE);
        System.out.println("double max : " + Double.MAX_VALUE);

        System.out.println("char min : " + Character.MIN_VALUE);
        System.out.println("char max : " + Character.MAX_VALUE);

//        System.out.println("boolean min : " + Boolean.MIN_VALUE);
//        System.out.println("boolean max : " + Boolean.MAX_VALUE);

    }
}
