/*
Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier, assume the digits are a string and use split()
 Input: 98,96,95,94,93
 Output: 98,96,95,94,93 non consecutive numbers

 Input: 54,53,52,51,50,49,48
 Output : 54,53,52,51,50,49,48 are consecutive numbers

 Input: 1,2,3,4,5,6,6
 Output: 1,2,3,4,5,6,6 non consecutive numbers

 */
package com.company;

public class ConsectiveNumbers {

    public static String isConsecutive(String input) {
        boolean b = true;

        //split string
        String[] numbers = input.split(",");

        //array initializing
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].matches("-?[0-9]+")) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            else {
                return "Number expected";
            }
        }

        //for finding difference
            for (int j = 0; j < array.length - 1; j++) {
                if (Math.abs((array[j]) - (array[j + 1])) != 1) {
                    b = false;
                    break;
                }
            }
            if (b) {
                return input + " are consecutive numbers";
            } else {
                return input + " are non consecutive numbers";
            }
    }
}