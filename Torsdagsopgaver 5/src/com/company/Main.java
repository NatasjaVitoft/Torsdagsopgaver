package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:

        System.out.println(printLongestWord(text));
        printFirstHalfOfEachWord(text);
        //System.out.println(Arrays.toString(printMostFrequentLetter(text)));
        System.out.println(printMostFrequentLetter(text));
        System.out.println(printLessFrequentLetter(text));



    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:

    // Task 1

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

    // Task 2

    public static void printFirstHalfOfEachWord(String [] halfWord) {
        for(String s : text) {
            int a = Math.round(s.length()/2);
            System.out.println(s.substring(a));
        }
    }

    //Task 3


    public static String printMostFrequentLetter(String [] Text ) {
        String[] alfa = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "m", "n", "l", "o", "p", "q", "r", "s", "t", "u", "v",
                "x", "y", "z", "æ", "ø", "å" };
        int [] mostFreq = new int [alfa.length];
        for(String word: text) {
            for(char letter : word.toCharArray()) {
                char a = Character.toLowerCase(letter);
                int i = 0;
                for(String letter2 : alfa) {
                    char b = letter2.charAt(0);
                    if (a == b) {
                        mostFreq[i] += 1;
                    }
                    i += 1;
                }
            }
        }
        int biggest = 0;
        for (int i = 0; i < mostFreq.length; i++) {
            biggest = mostFreq[i] > mostFreq[biggest] ? i : biggest;
        }

        String solution = ("The less frequent letter is: " + alfa[biggest] + " it occurs " + mostFreq[biggest] +" times");
        return solution;
    }

    //Task 4

    public static String printLessFrequentLetter(String [] Text ) {
        String[] alfa = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "m", "n", "l", "o", "p", "q", "r", "s", "t", "u", "v",
                "x", "y", "z", "æ", "ø", "å" };
        int [] lessFreq = new int [alfa.length];
        for(String word: text) {
            for(char letter : word.toCharArray()) {
                char a = Character.toLowerCase(letter);
                int i = 0;
                for(String letter2 : alfa) {
                    char b = letter2.charAt(0);
                    if (a == b) {
                        lessFreq[i] += 1;
                    }
                    i += 1;
                }
            }
        }
        int smallest = 0;
        for (int i = 0; i < lessFreq.length; i++) {
            smallest = lessFreq[i] < lessFreq[smallest] ? i : smallest;
        }

        String solution = ("The less frequent letter is: " + alfa[smallest] + " it occurs " + lessFreq[smallest] +" times");
        return solution;
    }
}
