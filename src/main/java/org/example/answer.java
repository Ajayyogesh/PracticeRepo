package org.example;

public class answer {
        public static void main(String[] args) {
            String input = "Ajay is an Engineer";
            String reversed = reverseStringWithVowels(input);

            System.out.println("Original String: " + input);
            System.out.println("Reversed String with Vowels Intact: " + reversed);
        }

        private static String reverseStringWithVowels(String input) {
            char[] charArray = input.toCharArray();
            int start = 0;
            int end = charArray.length - 1;

            while (start < end) {
                if (!isVowel(charArray[start])) {
                    while (end > start && isVowel(charArray[end])) {
                        end--;
                    }
                    char temp = charArray[start];
                    charArray[start] = charArray[end];
                    charArray[end] = temp;
                    end--;
                }
                start++;
            }

            return new String(charArray);
        }

        private static boolean isVowel(char c) {
            return "aeiouAEIOU".indexOf(c) != -1;
        }

}
