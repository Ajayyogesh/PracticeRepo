package org.example;

public class PrimeNumber {

    public static void main(String[] args) {
        int a = 46386283;
        System.out.println(primeCheck(a));
    }

    private static String primeCheck(int a) {
        if (a == 1 || a == 2) {
            return "The number is Prime";
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return "The number is not prime";
                }
            }
            return "The number is Prime";
        }
    }
}
