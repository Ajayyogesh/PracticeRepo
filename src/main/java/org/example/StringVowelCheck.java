package org.example;

public class StringVowelCheck {
    public static void main(String[] args) {
        String s = "hhhh";
        System.out.println(vowelCheck(s) ? "The string has vowels" : "The string has no vowels");
    }

    private static boolean vowelCheck(String s) {
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                return true;  // Found a vowel, return true
            }
        }
        return false;  // No vowel found in the entire string
    }
}

