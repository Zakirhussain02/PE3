/*
Write a java program to calculate first and last date of a week.
  Output:
  First Date of Week:             Mon 24/07/2017
  Last date of the week:          Sun 30/07/2017

 */
package com.company;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

//public class firstandLastDate {
//    public static void main(String[] args){
//        Calendar c = Calendar.getInstance();
//        Date thisDate = new Date();
//        SimpleDateFormat dateForm = new SimpleDateFormat("DD/MMMM/Y");
//        String myString = dateForm.format(thisDate);
//        for (int i=0;i<7;i++){
//            System.out.print(myString.format(c.getTime()));
//            c.add(Calendar.DATE,1)
//        }
//        System.out.print(myString);
//    }
//}

import java.text.*;

public class firstandLastDate {

    public static void main(String []args){
        Calendar calendar= Calendar.getInstance();

        // Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();

        // Print dates of the current week starting on Monday
        DateFormat dateformat = new SimpleDateFormat("E dd/MM/yyyy");

        System.out.println(dateformat.format(calendar.getTime()));

        for (int i = 0; i <6; i++) {
            calendar.add(Calendar.DATE,1);
        }
        System.out.println(dateformat.format(calendar.getTime()));
        System.out.println();
    }
}