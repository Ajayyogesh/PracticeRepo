package org.example;

public class StringConcat {
    static String s1 = "Ajay";
    static String s2 = "Yogesh";

    public static void main(String[] args) {
        String concatenatedString = concatenateStrings(s1, s2);
        System.out.println(concatenatedString);
        s1.concat(s2);
    }

    private static String concatenateStrings(String s1, String s2) {
        char[] result = new char[s1.length() + s2.length()];
        int index = 0;
        for (char c : s1.toCharArray()) {
            result[index++] = c;
        }
        for (char c : s2.toCharArray()) {
            result[index++] = c;
        }
        return new String(result);
    }
}

