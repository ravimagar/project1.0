package com.company;

public class LogicalOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.println((a>b) && (b<c));
        System.out.println((a>b) || (b<c));
        /*
        * && both condition must be true or result will false
        * || any one condition is true
        * */
    }
}
