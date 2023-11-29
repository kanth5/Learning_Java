package com.java.examples;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        System.out.println(inputString);

        System.out.println(isWordPalindrome(inputString));
    }

    private static boolean isWordPalindrome(String word) {

        String reverseWord = getReverseWord(word);
        if (word.equals(reverseWord))
            return true;
        else
            return false;

    }

    private static String getReverseWord(String word) {

        System.out.println("before : " + word);

        if (word == null || word.isEmpty()) {
            return word;
        }

        String tempWord = word.charAt(word.length() - 1) + getReverseWord(word.substring(0, word.length() - 1));
        System.out.println("after : " + tempWord);
        return tempWord;

    }
}
