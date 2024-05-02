package Stacks;

class MyStack {
    int CAPACITY;
    int top;
    int a[];

    MyStack(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        top = -1;
        a = new int[CAPACITY];
    }

    boolean push(int data) {
        if (top >= (CAPACITY - 1)) {
            System.out.println("Stack OverFlow");
            return false;
        } else {
            a[++top] = data;
            System.out.println(data + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack UnderFlow");
            return 0;
        } else {
            int data = a[top--];
            return data;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack UnderFlow");
            return 0;
        } else {
            int data = a[top];
            return data;
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(" " + a[i]);
        }
    }

}

public class Stack_usingArray {
    public static void main(String[] args) {
        MyStack s = new MyStack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Check Stack is Empty or not " + s.isEmpty());
        System.out.println("Top element is :" + s.peek());
        System.out.println(s.pop() + " Popped from stack");
        s.print();
        System.out.println("Size of Stack " + s.size());
        // for(int i=0; i<s.a.length; i++){
        // System.out.println(s.a[i]);
        // }
    }
}
