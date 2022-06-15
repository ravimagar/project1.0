package com.company;

public class ShiftOperator {
    public static void main(String[] args) {
        int a=10;   // 10 converts into the binary value int=32 bits
/*
 left shift operator
*       0000 0000 0000 1010
*       0000 000  0101 0000
 */
        System.out.println(a<<3); //80
/*
 right shift operator
*       0000 0000 0000 1010
*       0000 000  0101 0000
*/
        System.out.println(a>>3); //1
    }
}
