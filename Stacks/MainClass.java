package Stacks;

import java.util.ArrayDeque;

public class MainClass {
    public static void main(String[] args) {
        
        // MyStack stack = new MyStack(5); //using Array
        Stack_usingLinkedList stack = new Stack_usingLinkedList();
        stack.push(1);
        stack.push(4);
        stack.push(8);
        stack.push(12);
        stack.push(16);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        
        // stack.printStack();

        // stack.push(20);

        System.out.println(stack.pop());
        System.out.println("Peek Element "+stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(23);
        System.out.println(stack.pop());
        // stack.printStack();

        ArrayDeque<Integer> stackAD = new ArrayDeque<>();
        stackAD.push(23);
        stackAD.push(21);
        stackAD.push(54);
        
    }   
}