package com.company.Loops;

public class ForLoops {
    public static void main(String[]args){
        // The Java for loop is used to iterate a part of the program several times. If the
        //number of iteration is fixed, it is recommended to use for loop.
        // for loop will iterate whenever conditions are true once conditions got false for loop will be terminated
//        for (int i=0; i<=10; i++){
//            System.out.println(i);
//    }
//for (int a=10; a>=0; a--){
//    System.out.println(a);
//}

        // Write a Java program to find the sum of first 100 numbers using for loop?
        int sum=0;
        for(int i=1;i<=100;i++){
            sum = sum + i;
        }
        System.out.println("The sum of first 100 numbers is: "+sum);
    }
}
