package org.example;
//How would you determine if a number is even or odd in Java?

public class NumberOddOrEvenFinder {
    public static void main(String[] args) {
        int a = 27;
        System.out.println("The number " + a + " is an " +   finder(a)+" number");
    }

    private static String finder(int a) {
        if (a%2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}
