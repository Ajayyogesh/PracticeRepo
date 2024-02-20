package org.example;

import java.util.HashMap;

//Create a Java program to check if two strings are anagrams of each other
public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "$#@!";
        String s2 = "!@#$";
        if (anagramFinder(s1, s2)) {
            System.out.println(s1 + " & " + s2 + " is anagrams");
        } else {
            System.out.println(s1 + " & " + s2 + " is not anagrams");
        }
    }

    private static boolean anagramFinder(String s1, String s2) {
        return charCounter(s1.toLowerCase()).equals(charCounter(s2.toLowerCase()));
    }

    private static HashMap charCounter(String s) {

        char[] ch = s.toCharArray();

        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : ch) {

            m.put(c, m.getOrDefault(c, 0) + 1);

        }
        return m;


    }
}
