package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;


public class Main {

    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException {

             File file = new File("data.txt");
             scan = new Scanner(file);

             String inputFromFile = "";

              while (scan.hasNextLine()) {
                    inputFromFile += scan.nextLine();
              }

             text = inputFromFile.split(" ");


        try {
            printPartOfWord("Natasja", 1, 5);
        }
        catch (Exception e) {
            System.out.println("Something went wrong (indexOutOfBound)");
        }

        printIfPalindrome("Den laks skal ned");
        printWordWithDoubleConsonant();
        System.out.println(printLongestWord(text));

    }

    //Task 1

    public static void printWordWithDoubleConsonant() {
        for (String s : text) {
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i) == s.charAt(i+1)) {
                    System.out.println(s);
                }
            }
        }
    }


    //Task 2

    public static String printLongestWord(String [] word) {
        String longestWord = "";
        for(String s : text) {
            int a = longestWord.length();
            int b = s.length();
            if(a < b) {
                longestWord = s;
            }
        }
        return longestWord;
    }


    // Task 3

    public static void printPartOfWord (String word,int a, int b) {
        String c = word.substring(a);
        System.out.println(c.substring(0, b));

    }


    //Task 4

    public static void printIfPalindrome(String text) {

        String originalStr = text;
        String reverseStr = "";

        for (int i = (originalStr.length() - 1); i >=0; --i) {
            reverseStr = reverseStr + originalStr.charAt(i);
        }

        if (originalStr.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(originalStr);
        }
    }
}