package com.educative.interview.strings;

class StringInternDemo {
    public static void main( String args[] ) {

        String str1 = "Educative";
        String str2 = "Educative";
        System.out.println(str1 == str2);

        String str3 = new String("Educative");
        String str4 = new String("Educative");
        System.out.println(str3 == str4);

        String str5 = new String("Educative");
        str5.intern();
        String str6 = str5.intern();
        System.out.println(str6 == str1);
        System.out.println(str6 == str2);
        System.out.println(str6 == str3.intern());
        System.out.println(str6 == str4.intern());

        System.out.println(str1.equals(str3));

    }
}
