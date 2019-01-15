/*
Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.

 */
package com.company;

public class TryCatch
{
    public static void main(String[] args) {

        String[] str = new String[4];

        //exceptional block
        try {
            String string = str[7];
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("\n" + "Exception caught");

        } finally {
            System.out.println("\n" + "finally executed");
        }
    }
}