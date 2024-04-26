package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class KthNodeFromMiddle {
    public static int middleNodeElement(Node head, int B) {
        if (head == null || B < 0) {
            return -1;
        }
        int count = 0;

        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            count++;
        }

        if(B > count){
            return -1;
        }
        int pos  = count -B;
        Node slow = head;
        for(int i=0; i<pos; i++){
            slow = slow.next;
        }
        return slow.data;

    }

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
        System.out.println(middleNodeElement(head, 6));
    }
}