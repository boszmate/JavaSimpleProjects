package com.mateusz;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();

        stack.push("first element");
        stack.push("second element");
        stack.push("third element");

        stack.printStack();

        stack.pop();
        stack.pop();

        System.out.println("#==========#");

        stack.printStack();
    }
}
