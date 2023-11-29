package com.java.softwaretesting;

import java.util.ArrayList;

public class ArrayToString {

    public static void main(String args[]) {
        //Create and initialize the ArrayList
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Software");
        strList.add("Testing");
        strList.add("Help");
        //print the ArrayList
        System.out.println("The ArrayList: " + strList);
        //define a string buffer object
        StringBuffer sb = new StringBuffer();

        //append each ArrayList element to the string buffer object
        for (String str : strList) {
            sb.append(str + " ");
        }
        //convert string buffer to string and print it.
        String myStr = sb.toString();
        System.out.println("\nString from ArrayList: " + myStr);

        //define a string builder object
        StringBuilder sb1 = new StringBuilder();

        //append each ArrayList element to the string builder object
        for (String str : strList) {
            sb1.append(str + " ");
        }
        //convert string builder to string and print it.
        String myStr1 = sb1.toString();
        System.out.println("\nString from ArrayList: " + myStr1);

        ArrayList<String> metroList = new ArrayList<>();
        metroList.add("Delhi");
        metroList.add("Mumbai");
        metroList.add("Chennai");
        metroList.add("Kolkata");
        //print the ArrayList
        System.out.println("The ArrayList: " + metroList);
        // Join with an empty delimiter to concat all strings.
        String resultStr = String.join(":", metroList);
        System.out.println("\nString converted from ArrayList: "+resultStr);
    }
}