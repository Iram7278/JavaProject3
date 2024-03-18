package org.example.ProjectTask;

public class Q2 {
    public static void main(String[] args) {
        int [] num={2,3,4,5,6};
        int sum=0;
        for (int i=0;i<num.length;i++){ //*Always use loop with Arrays*
            sum=sum+num[i];
        }
        System.out.println(sum);
    }
}
