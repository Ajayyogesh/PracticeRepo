package org.example;

import java.util.Scanner;

//How do you find the length of a string in Java?
public class LengthOfAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = scan.next();
        System.out.println("Length of the string is "+ lengthOfString(s));

    }

    private static int lengthOfString(String s) {
        return s.length();
    }
}
