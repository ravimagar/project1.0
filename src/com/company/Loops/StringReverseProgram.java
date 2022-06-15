package com.company.Loops;
// in String.length methods is use for find how many character are there in name
public class StringReverseProgram {
    public static void main(String[] args) {
        String name = "Welcome"; // take any value
        for (int i = name.length() - 1; i >= 0; i--) { // i= name.length-1 means welcome has 7 character
            // but it will start from 0 so if we use .length then it will give expected result.
            System.out.print(name.charAt(i));
        }
        String s = "Ravindra";
        for (int i = s.length() - 1; i >= 0; i--) // condition i>=0 means index value is 0 and till the 0 loop will iterate
            System.out.print(s.charAt(i)); // used of charAT method for shows the character number of positions
        // means which character is on which position


        String l = "magar";
        for (int a = l.length() - 1; a >= 0; a--) {
            System.out.print(l.charAt(a));

        }
    }
}