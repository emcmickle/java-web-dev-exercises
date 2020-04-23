package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,11)
        );

        sumOfEven(integers);

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("hello", "world", "armpit", "Liz", "Sean", "Sophie", "Jenny")
        );
        fiveLetterWords(words);
    }

    public static void sumOfEven(ArrayList<Integer> integerArrayList) {
        Integer sum = 0;
        for (Integer i : integerArrayList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void fiveLetterWords(ArrayList<String> words) {
        Scanner input;
        double wordLength;
        input = new Scanner(System.in);
        System.out.println("Enter the desired word length: ");
        wordLength = input.nextDouble();
        for (String i : words) {



            if (i.length() == wordLength) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
