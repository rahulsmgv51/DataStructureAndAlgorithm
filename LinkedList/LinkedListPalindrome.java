package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedListPalindrome {

    public static int isPalin(Node head) {
        Node midNode = findMiddleOfLinkedList(head);
        Node t2 = reverseLinkedList(midNode);
        Node t1 = head;
        while (t2 != null) {
            if(t1.data != t2.data){
                return 0;
            }
            t2 = t2.next;
            t1 = t1.next;
        }
        return 1;
    }

    public static Node findMiddleOfLinkedList(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverseLinkedList(Node midHead){
        if(midHead == null || midHead.next == null){
            return midHead;
        }

        Node prev = midHead;
        Node curr = midHead.next;
        midHead.next = null;
        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(1);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(isPalin(head));
        // System.out.println(midNode.data);
        // Node midReverseNode = reverseLinkedList(head);
        // printLinkedList(midReverseNode);

    }
}
