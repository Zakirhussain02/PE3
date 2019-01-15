/*
Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
 Input:
    India
    United States
    Germany
     Egypt
     czechoslovakia

Output:
    Place Name without Vowels:0 Ind
    Place Name without Vowels:1 Untd Stts
    Place Name without Vowels:2 Grmny
    Place Name without Vowels:3 Egypt
    Place Name without Vowels:4 czchslvk

 */
package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Removevowels {

    public static String isvowel( String a ) {
        // String to be scanned to find the pattern.
        String input = "India,United States,Germany,Egypt,czechoslovakia";

        //string split
        String[] items = input.split(",");
        int itemCount = items.length;

        //regex use for removig vowels
        String fixedInput = input.replaceAll("[aeiou]", "");
        String[] item = fixedInput.split(",");

        for (int i = 0; i < itemCount; i++) {
            return ("Place Name without Vowels:" + i + " " + item[i]);
        }
        return null;
    }
}


