package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class My_LinkedList_Class {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(8);
        head.next = n1; 
        n1.next = n2;
        n2.next = n3;

        printLinkedList(head);
        head = insertInLinkedList(0, 16, head);
        printLinkedList(head);
        head = deleteFromLinkedList(0, head);
        printLinkedList(head);
        head = insertInLinkedList(3, 10, head);
        head = deleteFromLinkedList(2, head);
        printLinkedList(head);

    }

    public static Node deleteFromLinkedList(int pos, Node head){
        if(pos == 0){
           head = head.next;
           return head;
        }
        Node temp = head;
        for(int i=0; i<pos-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }


    public static Node insertInLinkedList(int pos, int data, Node head){
        Node newNode = new Node(data);
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        for(int i=0; i<pos-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}