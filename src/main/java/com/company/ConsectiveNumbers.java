package com.company;

import java.util.Scanner;
import java.util.Scanner;

public class ConsectiveNumbers {

    public static String isConsecutive(String input) {
        boolean b = true;
        String[] numbers = input.split(",");
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].matches("-?[0-9]+")) {
                array[i] = Integer.parseInt(numbers[i]);
            } else {
                return "Number expected";
            }
        }
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