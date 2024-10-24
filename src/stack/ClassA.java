package stack;

import java.util.Stack;

public class ClassA {
    public void method1() {
        System.out.println("Implementing the Stack");
        System.out.println("It follows Last In First Out (LIFO) order and allows null values.");
        Stack<Object> stack = new Stack<>();
        stack.push(10);
        stack.push("java");
        stack.push(20);
        stack.push(null);
        stack.push(30);
        stack.push('a');
        stack.push(50);
        System.out.println("Stack: " + stack);
        System.out.println("-------------");
        System.out.println("Size of Stack: " + stack.size());
        System.out.println("Retrieving elements in LIFO order using pop():");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        stack.push(10);
        stack.push("java");
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("-------------");
        System.out.println("Top element of the Stack (using peek()): " + stack.peek());
        System.out.println("Is Stack empty? " + stack.isEmpty());
        System.out.println("Adding element 100 to Stack.");
        stack.push(100);
        System.out.println("After adding 100: " + stack);
        System.out.println("Removing element from the top of the Stack.");
        stack.pop();
        System.out.println("After removing the top element: " + stack);
        System.out.println("Does Stack contain 'java'? " + stack.contains("java"));
        System.out.println("Does Stack contain 500? " + stack.contains(500));
    }

    public static void main(String[] args) {
        ClassA stackExample = new ClassA();
        stackExample.method1();
    }
}
