package org.example.ProjectTask;

public class Q8 {
    public static void main(String[] args) {
        int [] number={3,7,2,5,1,9,4};
        int maxNum=0;
        for (int i=0;i<number.length;i++){
            if (number[i]>maxNum){
                maxNum=number[i];
            }
        }
        System.out.println(maxNum);
        int minNum=3;
        for (int i=0;i<number.length;i++){
            if (number[i]<minNum){
                minNum=number[i];
            }
        }
        System.out.println(minNum);
    }
}
