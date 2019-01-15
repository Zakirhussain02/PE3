/*
Write a program to compute the addition of two matrix, Read the number of rows and columns as input, also the values of each matrix
  Output:
  Input number of rows of matrix: 3
  Input number of columns of matrix: 2
  Input elements of first matrix: 1 2 3 4 5 6
  Input the elements of second matrix: 9 8 7 6 5 4
  Sum of the matrices:-
                     10        10
                     10        10
                     10        10

 */
package com.company;

public class Addmatrices {

    public String add(int row, int col, String [] firstMatrix, String[] secondMatrix){
        StringBuilder result=new StringBuilder();
        int [][] add = new int [row][col];
        int [][] first = new int[row][col];
        int [][] second = new int[row][col];
        System.out.print(firstMatrix);
        int x = 0;
        int k=0;
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                //  first[i][j]=Integer.parseInt(firstMatrix[k]);
                //if (Character.isDigit(first[i][j]) && Character.isDigit(second[i][j])) {
                    first[i][j] = Integer.parseInt(firstMatrix[k]);
                    second[i][j]=Integer.parseInt(secondMatrix[k]);
                    k++;
                    add[i][j] = first[i][j] + second[i][j];
                    result.append(add[i][j]+" ");
            }
        }
        return result.toString();
    }
}
