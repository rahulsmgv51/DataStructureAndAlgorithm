package LinkedList.DoublyLinkedList;

public class MyDoublyLL {
    public static void main(String[] args){
        Node<Integer> head = new Node<>(2);
        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(12);
        Node<Integer> n3 = new Node<>(7);

        head.next = n1; n1.prev = head; n1.next = n2; n2.prev = n1; n2.next = n3; n3.prev = n2;
        printDLL(head);
        head = addDLL(23, 0, head);
        printDLL(head);
        head = addDLL(32, 2, head);
        printDLL(head);
    }

    public static void printDLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> addDLL(int val, int pos, Node<Integer> head){
        Node<Integer> newNode = new Node(val);
        if(pos == 0){
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        Node<Integer> temp = head;
        for(int i=0; i<pos-1; i++){
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;

        return head;

    }
}

class Node<E> {
    E data; 
    Node<E> next;
    Node<E> prev;

    public Node(E data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}