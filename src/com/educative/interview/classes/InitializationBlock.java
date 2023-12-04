package com.educative.interview.classes;

class InitializationBlock {
    public static void main( String args[] ) {
        EducativeCourse1 ec = new EducativeCourse1();
        System.out.println( "Course name: " + ec.courseName + " Version: " + ec.version);
    }
}

class EducativeCourse1 {

    String courseName = setCourseName();

    String version;

    // initialization block
    {
        version = "1.0";
    }

    // final method used for initialization
    private String setCourseName() {
        return "Java Interview Bible " + version;
    }
}
