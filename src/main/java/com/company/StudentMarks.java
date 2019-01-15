/*
 Create a class called StudentMarks, which prompts user for the number of students, reads it from the keyboard, and saves it in an int variable called numOfStudents.
 It then prompts user for the grades of each of the students and saves them in an int array called stuGrades. Your program shall check that the grade is between 0 and 100
  else has to trow an error message.
 */
package com.company;

import java.util.Scanner;

public class StudentMarks {
    public String studentGrades(String[] a,int number)
        {
            StringBuilder result=new StringBuilder();

            for(int i=0;i<number;i++)
            {
                if(Integer.parseInt(a[i])<100)
                {
                    result.append(a[i]+" ");
                }
                else
                    return "Invalid Input";
            }
            return result.toString();
        }
    public static void main(String a[]) {

        //number of inputs
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number of students ");
        int numOfStudents = Integer.parseInt(number.nextLine());

        //store the inputs
        String stuGrades[] = new String[numOfStudents];
        for (int i = 0; i < stuGrades.length; i++) {
            System.out.print("Enter the grades " + (i+1) + " : ");
            stuGrades[i] = number.nextLine();
            if (Integer.parseInt(stuGrades[i])>100){
                System.out.println("Error");
                break;
            }
        }

        //Now show the grades
        /*for (int i = 0; i < stuGrades.length; i++) {
            System.out.print("Grades of students are " + (i+1) + " : ");
            System.out.print(stuGrades[i] + "\n");
        }
        for (int j=0;j<stuGrades.length;j++){
            if (Integer.parseInt(stuGrades[j])>100){
                System.out.print("Error");
            }
        }*/

    }
}
