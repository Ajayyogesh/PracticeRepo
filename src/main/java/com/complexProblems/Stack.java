package com.complexProblems;

public class Stack {
    private static final int MAX_SIZE = 1000;
    private int[] array;
    private int top;

    public Stack() {
        array = new int[MAX_SIZE];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot push element: " + item);
            return;
        }
        array[++top] = item;
        System.out.println("Pushed element: " + item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot pop element.");
            return -1; // Return a special value indicating underflow
        }
        int poppedItem = array[top--];
        System.out.println("Popped element: " + poppedItem);
        return poppedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a special value indicating empty stack
        }
        return array[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();

        System.out.println("Top element: " + stack.peek());
    }
}
