package org.example.ProjectTask;

public class Q9 {
    public static void main(String[] args) {
        int[] number = {3, 7, 2, 5, 1, 9, 4};
        int lgNum = 0;
        int lgNum2 = 0;
        for (int i = 0; i < number.length; i++) {
           if (number[i]>lgNum){
               lgNum2=lgNum; //assign old value of lgNum to lgNum2, before updateing lgNum.
               lgNum=number[i];
           }else if(number[i]>lgNum2){
               lgNum2=number[i];
           }
        }
        System.out.println(lgNum2);
    }
}
