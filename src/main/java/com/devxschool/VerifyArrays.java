package com.devxschool;

import java.util.Arrays;

public class VerifyArrays {
    public static void main(String[] args) {
        /**
         * Write a program that checks if the given two arrays are equal
         *
         * Values and indexes must match.
         * must be case-sensitive
         *
         * EX:
         * String[] arr1 = new String[]{"A", "B", "C"};
         * String[] arr2 = new String[]{"A", "B", "C"}
         *
         * true
         *
         * EX2:
         * String[] arr2 = new String[]{"A", "B", "C"};
         * String[] arr3 = new String[]{"B", "B", "A"};
         *
         * false
         */

        //TODO WRITE YOUR CODE HERE

        String[] arr1 = new String[]{"A", "B", "C"};
        String[] arr2 = new String[]{"A", "B", "C"};
        String[] arr3 = new String[]{"B", "B", "A"};

        System.out.println(areEqual(arr1,arr3));
        System.out.println(areEqual(arr2,arr3));
        System.out.println(areEqual(arr1,arr2));

    }

    public static boolean areEqual(String[] arr1, String[] arr2) {
        //TODO IMPLEMENT THIS METHOD


        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;

        }
        return true;

    }
}


