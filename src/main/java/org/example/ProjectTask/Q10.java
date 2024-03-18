package org.example.ProjectTask;

public class Q10 {
    public static void main(String[] args) {
        String [] cars={"Toyota","Honda","kia","jaguar","kia"};

        for (int i=0;i<cars.length;i++){
            for (int j=i+1;j<cars.length;j++){
                if(cars[i].equals(cars[j])){
                    System.out.println(cars[i]);
                }
            }
        }
    }
}
