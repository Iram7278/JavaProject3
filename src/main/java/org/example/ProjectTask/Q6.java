package org.example.ProjectTask;

public class Q6 {
    public static void main(String[] args) {
        // Prime numbers are numbers only divisible by themselves.

        int num=13;
        for (int i=2;i<=num;i++){
            if (num%i==0 && num!=2){
                System.out.println("Non Prime");
                break;
            }else{
                System.out.println("Prime");
                break;
            }
        }
    }
}
