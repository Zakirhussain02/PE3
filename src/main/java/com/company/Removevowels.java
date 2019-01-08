package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Removevowels {

    public static String isvowel( String a ) {
        // String to be scanned to find the pattern.
        String input = "India,United States,Germany,Egypt,czechoslovakia";
        String[] items = input.split(",");
        int itemCount = items.length;
        String fixedInput = input.replaceAll("[aeiou]", "");
        String[] item = fixedInput.split(",");
        for (int i = 0; i < itemCount; i++) {
            return ("Place Name without Vowels:" + i + " " + item[i]);
        }
        return null;
    }
}


