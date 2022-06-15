package com.company.InterviewPrograms;

public class Test8 {
    public static void main(String[] args) {
        String s= "Akshay";
        String s1="Akshay";
        String s2 = new String("Akshay");
        String s3 = new String("Akshay");
        System.out.println(s2==s3);

        // when we create a String with the help of new keyword it will stored in heap memory and every time
        // create new space on heap memory that's why its showing false result


    }
}
