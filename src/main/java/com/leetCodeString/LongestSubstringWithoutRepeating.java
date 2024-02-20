package com.leetCodeString;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        // Map to store the last index of each character in the substring
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        // Two pointers for the sliding window
        int start = 0;
        int end = 0;

        while (end < n) {
            char currentChar = s.charAt(end);

            // If the character is already in the substring, move the start pointer
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);

            // Store the index of the current character
            charIndexMap.put(currentChar, end);

            // Move the end pointer to the next character
            end++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
