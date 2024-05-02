package Stacks;

public class MySapnStack {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

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

    int peek() {
        return head.data;
    }
}