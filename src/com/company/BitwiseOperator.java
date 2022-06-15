package com.company;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a=10;
        int b=6;
        /*
        *1010
        *0110
        *----
        *0010
        *  */
        System.out.println(a&b);//2
        /*
        * 1010
        * 0110
        * ----
        * 1110
        * */
        System.out.println(a|b);//14
        /*
        * 1010
        * 0110
        * ----
        * 1100
        *
        * */
        System.out.println(a^b);//12
    }
}
