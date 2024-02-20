package org.example;

import java.util.Scanner;
//How do you check if a string is a palindrome in Java?
public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = scan.next();

        System.out.println(s + palinromeCheck(s.toLowerCase()));
    }

    private static String palinromeCheck(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while(start < end){
           if (ch[start] == ch[end]){
               start+=1;
               end-=1;
           } else  {
               return " is not palindrome";
           }

        }
        return " is palindrome";


    }
}
