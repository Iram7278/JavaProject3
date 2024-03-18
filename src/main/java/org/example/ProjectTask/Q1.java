package org.example.ProjectTask;

public class Q1 {
    public static void main(String[] args) {

        int [] temp={50,45,48,52,55,43,46};
        int maxTemp=0;
        for (int i=0;i<temp.length;i++){
            if (temp[i]>maxTemp){//temp[i] is to take each element from Array
                maxTemp=temp[i];// to update maxTemp in if condition
            }
        } System.out.println(maxTemp); //Print AFTER "for loop" block
        int minTemp=50; //we take the *first* element from Array
        for (int i=0;i<temp.length;i++){
            if (temp[i]<minTemp){
                minTemp=temp[i];
            }
        } System.out.println(minTemp); //Print AFTER "for loop" block
    }
}
