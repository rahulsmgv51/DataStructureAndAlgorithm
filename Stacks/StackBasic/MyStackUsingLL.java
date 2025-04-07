package Stacks.StackBasic;

public class MyStackUsingLL {
    Node<Integer> head;

    public static void main(String[] args) {
        MyStackUsingLL myStackll = new MyStackUsingLL();
        myStackll.push(2);myStackll.push(3);myStackll.push(5);myStackll.push(7);myStackll.push(9);myStackll.push(8);
        myStackll.printStack();
        myStackll.pop();
        myStackll.printStack();
        System.out.println("Peek Element : "+myStackll.peek());
    }

    public void push(int data) {
        Node<Integer> newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Underflow !!");
            return -1;
        }

        int tmp = head.data;
        head = head.next;
        return tmp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Underflow !!");
            return -1;
        }

        return head.data;
    }

    public void printStack(){
        Node<Integer> tmp = head;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }

        System.out.println();
    }
}

class Node<E> {
    E data;
    Node next;

    public Node(E data) {
        this.data = data;
        next = null;
    }
}