package org.example;

import java.util.Scanner;

/*
implement a Java method that takes a sentence as input and returns a new sentence
where each word starts with an uppercase letter and the rest of the letters are in lowercase?
 */

public class StringCapitalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string");
        String s = scanner.nextLine();
        System.out.println(stringCaptalizer(s));

    }

    private static String stringCaptalizer(String s) {
        char[] ch = s.toCharArray();
        boolean capitalizeNext = true;

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (Character.isWhitespace(c)){
                capitalizeNext = true;
            } else if (capitalizeNext) {
                ch[i] = Character.toUpperCase(c);
                capitalizeNext = false;
            }else {
                ch[i] = Character.toLowerCase(c);
            }
        }
    return new String(ch);
    }
}
