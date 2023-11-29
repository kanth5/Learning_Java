package com.interview.classes;

class StaticBlocks {
    public static void main( String args[] ) {
        EducativeCourse ec = new EducativeCourse();
        System.out.println( "name: " + ec.courseName );

        EducativeCourse ec1 = new EducativeCourse("2.0");
        System.out.println( "name: " + ec1.courseName );
    }
}

class EducativeCourse {

    static String courseName;
    static String version;

    // We have two static initialization blocks
    static {
        version = "1.0";
    }

    static {
        courseName = "Java Interview Bible";
    }

    public EducativeCourse() {
        System.out.println("Inside No Args Constructor");
        System.out.println(courseName + " " + version);
    }

    public EducativeCourse(String version) {
        System.out.println("Inside String Arg Constructor");
        System.out.println(courseName + " " + version);
    }
}
