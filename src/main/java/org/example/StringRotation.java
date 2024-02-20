package org.example;

public class StringRotation {

    public static void main(String[] args) {
        String s = "waterbottle";

        System.out.println(strLeftRotate(s, 2));
        System.out.println(strRightRotate(s, 6));
    }

    // Left rotate the string by 'a' positions
    private static String strLeftRotate(String s, int a) {
        return s.substring(a) + s.substring(0, a);
    }

    // Right rotate the string by 'a' positions
    private static String strRightRotate(String s, int a) {
        return s.substring(s.length() - a) + s.substring(0, s.length() - a);
    }
}
