package com.educative.interview.methods;

class IntegerSwap {
    public static void main( String args[] ) {
        (new IntegerSwap()).run();
    }

    public void run() {
        Integer x = 5;
        Integer y = 9;

        System.out.println("Before Swap1 x: " + x + " y: " + y);
        swap1(x, y);
        System.out.println("After Swap1 x: " + x + " y: " + y);

        System.out.println("Before Swap2 x: " + x + " y: " + y);
        swap2(x, y);
        System.out.println("After Swap2 x: " + x + " y: " + y);

        String[] students = new String[10];
        String studentName = "You are an awesome developer";
        students[0] = studentName;
        studentName = null;
        System.out.println(students[0]);
    }

    private void swap1(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    private void swap2(Integer a, Integer b) {
        a = 9;
        b = 5;
    }
}
