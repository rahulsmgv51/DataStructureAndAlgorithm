package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class ReverseA_LinkedList {
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    // Using Recursion
    // public static Node reverseLinkedList(Node head) {
    // if(head == null || head.next == null){
    // return head;
    // }
    // Node headOfSubProblem = reverseLinkedList(head.next);
    // head.next.next = head;
    // head.next = null;

    // return headOfSubProblem
    // }

    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        head.next = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // public static Node reverseLinkedList(Node head) {
    // if (head == null || head.next == null)
    // return head;

    // Node newHead = null;
    // while (head != null) {
    // Node temp = new Node(head.data);
    // if (newHead == null) {
    // newHead = temp;
    // } else {
    // temp.next = newHead;
    // }
    // newHead = temp;
    // head = head.next;
    // }
    // return newHead;
    // }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);
        Node n7 = new Node(8);
        Node n8 = new Node(9);
        Node n9 = new Node(10);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        Node nHead = reverseLinkedList(head);
        printLinkedList(nHead);
    }
}