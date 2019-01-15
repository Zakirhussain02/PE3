/*
Write a program to create a ChessBoard pattern with the help of multidimensional array, where WWrepresents white color and BB represents Black color.
 Output:
 My Chess Board
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|

 */
package com.company;

import java.util.ArrayList;
import java.util.List;
public class ChessBoardPattern {
    public static void main(String[] args) {
        System.out.println(chessPattern(8, 8));
    }

    public static String chessPattern(int a, int b) {
        String str = "WW|";
        String outputString = "";
        //fot rows
        for (int i = 0; i < a; i++) {
            switch (str) {
                case "WW|":
                    str = "BB|";
                    break;
                case "BB|":
                    str = "WW|";
                    break;
            }
            //for colums
            outputString = outputString + "\n";
            for (int j = 0; j < b; j++) {
                switch (str) {
                    case "WW|":
                        str = "BB|";
                        outputString = outputString + str;
                        break;
                    case "BB|":
                        str = "WW|";
                        outputString = outputString + str;
                        break;
                }
            }
        }
        return outputString;
    }
}
