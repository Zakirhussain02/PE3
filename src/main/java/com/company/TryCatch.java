package com.company;

public class TryCatch
{
    public static void main(String[] args) {
        String[] str = new String[4];
        try {
            String string = str[7];
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("\n" + "Exception caught");

        } finally {
            System.out.println("\n" + "finally executed");
        }
    }
}