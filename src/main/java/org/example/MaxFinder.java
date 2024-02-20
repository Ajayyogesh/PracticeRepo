package org.example;

public class MaxFinder {
    public static void main(String[] args) {
        int a =122;
        int b =122;
        int c =122;
        System.out.println("The maximum number is " + maxFinder(a,b,c));
    }

    private static String maxFinder(int a, int b, int c) {
         if (a >= b && a >= c) {
            return "a = " + a + " is the maximum.";
        } else if (b >= c) {
            return "b = " + b + " is the maximum.";
        } else {
            return "c = " + c + " is the maximum.";
        }
    }
}
