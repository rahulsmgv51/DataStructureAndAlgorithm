package Stacks;

public class MyStack {
    private int size;
    private int a[];
    private int top;

    public MyStack(int size) {
        this.size = size;
        a = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean push(int data) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return false;
        } else {
            top++;
            a[top] = data;
            return true;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int temp = a[top];
            top--;
            return temp;
        }
    }

    int peek() {
        return a[top];
    }

    void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}