package org.example.ProjectTask;

public class Q4 {
    public static void main(String[] args) {

        int [][] inPut={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {2,7,8},
        };
        int sumEven=0;
        int sumOdd=0;
        for (int i=0;i<inPut.length;i++){
            for (int j=0;j<inPut[i].length;j++){
                if (inPut[i][j]%2==0){
                    sumEven=sumEven+inPut[i][j];
                } else{
                   sumOdd=sumOdd+inPut[i][j];
                }
            }
        } System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
