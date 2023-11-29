package com.interview.serialization;

import java.io.*;

class SerializationDemo {
    public static void main( String args[] ) {
        EducativeCourse1 javaInterviewBible = new EducativeCourse1();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try (ObjectOutput out = new ObjectOutputStream(bos)) {
            out.writeObject(javaInterviewBible);
            out.flush();
        } catch (Exception e) {
            // Ignore exception, not to be done in production
        }
        byte[] courseInBytes = bos.toByteArray();
        System.out.println("Serialized byte array length : "  + courseInBytes.length);

        for (byte b : courseInBytes) {
            System.out.print(" " + b);
        }

        System.out.println();

        for (byte b : courseInBytes) {
            System.out.print(" " + (char)b);
        }
    }
}

class EducativeCourse1 implements Serializable {

    private String name = "Java Interview Bible";
    private int lessons;
    private int likes;
}