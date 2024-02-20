package org.example;
//swap the values of two variables without using a third variable in Java?
public class SwappingTwoVariablesWIthout {
    public static void main(String[] args) {
        int a = 10;
        int b = 67;
        System.out.println(swapper(a,b));
    }

    private static String swapper(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return "a = " + a + " and b = " + b;
    }
}
