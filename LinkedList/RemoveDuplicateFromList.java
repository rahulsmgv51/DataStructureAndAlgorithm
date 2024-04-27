package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

}

public class RemoveDuplicateFromList {
    public static Node removeDuplicatNode(Node head) {
        Node temp = head;
        Node Original = head;
        Node newHead = null;

        while (Original != null) {
            while (Original.next != null && Original.data == Original.next.data) {
                Original = Original.next;
            }
            if (newHead == null) {
                newHead = temp = Original;
            }else{
                temp.next = Original;
                temp = Original;
            }
            Original = Original.next;
        }

        return newHead;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(-1);
        Node n1 = new Node(-1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(3);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        head=removeDuplicatNode(head);
        printLinkedList(head);
    }
}