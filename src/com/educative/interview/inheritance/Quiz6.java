package com.educative.interview.inheritance;

import java.io.*;

class Quiz6 {
    public static void main( String args[] ) throws Exception {

        EducativeCourse course = new EducativeCourse("C. H. Afzal");

        System.out.println(course.company);
        System.out.println(course.getAuthorName());

    }
}

class Course {

    String company;

    private Course() {
    }

//    public Course () {
//    }

    Course(String company) {
        this.company = company;
    }
}

class EducativeCourse extends Course implements Serializable {

    public EducativeCourse(String authorName) {
        super("Educative");
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    private String authorName;
}