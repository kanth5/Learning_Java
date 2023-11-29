package com.java.examples;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reverseString = "";

        int stringLength = str.length();

        for (int i=stringLength-1; i>=0; i--) {
            char c = str.charAt(i);
            reverseString = c + reverseString;
        }

        System.out.println(reverseString);

        if (str.equals(reverseString)) {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
    }
}
