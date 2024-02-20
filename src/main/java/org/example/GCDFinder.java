package org.example;


public class GCDFinder {

    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        System.out.println("The GCD of " + a + " and " + b + " is: " + findGCD(a, b));
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


