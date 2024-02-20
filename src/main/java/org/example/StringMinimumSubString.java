package org.example;

import java.util.HashMap;
import java.util.Map;

public class StringMinimumSubString {
    public static String findMinimumSubstring(String s, String set) {
        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for (char c : set.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int requiredChars = set.length();

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (charCount.containsKey(rightChar)) {
                charCount.put(rightChar, charCount.get(rightChar) - 1);
                if (charCount.get(rightChar) >= 0) {
                    requiredChars--;
                }
            }

            while (requiredChars == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                if (charCount.containsKey(leftChar)) {
                    charCount.put(leftChar, charCount.get(leftChar) + 1);
                    if (charCount.get(leftChar) > 0) {
                        requiredChars++;
                    }
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String set = "ABC";
        System.out.println(findMinimumSubstring(s, set)); // Output: "BANC"
    }

}
