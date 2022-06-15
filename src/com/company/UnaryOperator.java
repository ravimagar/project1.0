package com.company;

public class UnaryOperator {
    public static void main(String[] args) {
        int x=10;

        System.out.println("x++ :"+x++);    //10 x is 11        // postfix value stored same then increase by 1
        System.out.println("++X :"+ ++x);   //12 x ix 12        //Prefix value increase by 1
        System.out.println("x-- :"+ x--);   //12 x is 11        //post decremental stored same value then less by 1
        System.out.println("--x :"+ --x);   // 10 x is 10       //pre decremental less by 1
        System.out.println(++x + x++ + x++ + ++x); //13+10+11+14 priority to postfix first
    }
}
