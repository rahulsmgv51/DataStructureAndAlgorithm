package Queue;

import java.util.ArrayDeque;
import java.util.Stack;

public class Queue_Using_TwoStack {
    // ArrayDeque<Integer> s1 = new ArrayDeque<>();
    // ArrayDeque<Integer> s2 = new ArrayDeque<>();
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        if (!s2.isEmpty()) {
            return s2.pop();
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        return s2.pop();
    }

    public void printStack() {
        while (!s2.isEmpty()) {
            System.out.print(s2.pop()+" ");
        }
        while (!s1.isEmpty()) {
            System.out.print(s1.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Queue_Using_TwoStack qStack = new Queue_Using_TwoStack();
        qStack.enqueue(5);
        qStack.enqueue(10);
        qStack.dequeue();
        qStack.enqueue(15);
        qStack.enqueue(20);
        qStack.enqueue(25);
        qStack.dequeue();
        qStack.enqueue(30);
        qStack.dequeue();
        qStack.enqueue(35);
        qStack.printStack();
    }
}