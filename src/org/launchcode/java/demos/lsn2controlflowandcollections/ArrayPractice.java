package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] intsArray = {1, 1, 2, 3, 5, 8};

        for (int i : intsArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        String drSuess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = drSuess.split("\\. ");
        System.out.println(Arrays.toString(words));

    }
}
