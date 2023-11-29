package com.java.softwaretesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

    public static void main(String args[]){
        //define a string
        String myStr = "The string to ArrayList program";
        //convert string to array using split function on spaces
        String strArray[] = myStr.split(" ");
        //print the string
        System.out.println("The input string : " + myStr);
        //declare an ArrayList
        List<String> strList = new ArrayList<String>();
        //convert string array to ArrayList using asList method
        strList = Arrays.asList(strArray);
        //print the resultant ArrayList
        System.out.println("\nThe ArrayList from String:" + strList );
    }

}