package Stacks;

public class Stack_usingLinkedList {
    Node head;

    boolean isEmpty() {
        return head == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int temp = head.data;
            head = head.next;
            return temp;
        }
    }

    int peek(){
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }else{
            return head.data;
        }
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
