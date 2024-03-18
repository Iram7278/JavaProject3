package org.example.ProjectTask;

public class Q3 {
    //Create a 2D array or integer type where you will store odd and even numbers.
    // Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {
        int [][] num={
                {1,2,3,4,5},//ind 0
                {6,7,8,9,10},//ind 1
                {11,12,13,14,15},//ind 2
        };
        for (int i=0;i<num.length;i++){ //declaring rows
            for (int j=0;j<num[i].length;j++){// declaring the columns
              if (num[i][j]%2==0){
                  System.out.println(num[i][j]);
              }
            }
        }
    }
}
