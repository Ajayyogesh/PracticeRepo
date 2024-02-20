package org.example;

import java.util.Scanner;

//How would you calculate the factorial of a non-negative integer in Java
public class FactorialOfANumber {
    private static int factorial(int a) {
        int factorial = 1;
        for (int i = a; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        while (true) {
            System.out.println("Please enter a positive number");
            a = scanner.nextInt();
            if (a > 0) {
                break;
            }
        }
        System.out.println("The Factorial of " + a + " is " + factorial(a));
        scanner.close();
    }

}
