package com.interview.serialization;

// If the super class isn’t serializable, its fields will not be part of the serialized byte stream. When the same byte stream is
// deserialized, the super class fields will have the default value assigned by the Java platform for primitive types and null for
// reference types.

import java.io.*;

class Quiz1 {
    public static void main( String args[] ) throws Exception {
        EducativeCourse2 course = new EducativeCourse2("C. H. Afzal");

        // Serialization code
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutput out = new ObjectOutputStream(bos)) {
            out.writeObject(course);
            out.flush();
        } catch (Exception e) {
            throw e;
        }
        byte[] courseInBytes = bos.toByteArray();

        // Deserialization code
        ByteArrayInputStream bis = new ByteArrayInputStream(courseInBytes);
        try (ObjectInput in = new ObjectInputStream(bis)) {
            EducativeCourse2 deserializeCourse = (EducativeCourse2) in.readObject();
            System.out.println(deserializeCourse.company);

        } catch (Exception e) {
            throw e;
        }

    }
}

class Course {

    String company;

// If we make the parameterless constructor of the super class Course public, the subtype EducativeCourse would become serializable.

//    private Course() {
//    }

    public Course () {
    }

    Course(String company) {
        this.company = company;
    }
}

class EducativeCourse2 extends Course implements Serializable {

    public EducativeCourse2(String authorName) {
        super("Educative");
        this.authorName = authorName;
    }

    private String authorName;
}

//Non-static nested classes (inner classes) shouldn't implement the Serializable interface. The default serialized form of an inner
// class is ill-defined.

//Static nested classes can, however, implement Serializable.

//If a serializable class doesn't declare a serialVersionUID, the JVM will generate one automatically at run-time.

//If a class implements the Serializable interface, all its subclasses are also serializable

//If one of the fields in a class is another object, then in order for the class to be serializable, it is imperative that the member
// objects of the class are also serializable.

//A subclass can't be serialized if its non-serializable super class doesn't provide an accessible parameterless constructor.