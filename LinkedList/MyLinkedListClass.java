package LinkedList;

public class MyLinkedListClass {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class MyLinkedList {
        Node head; 
        Node tail;
        int size;

        public void push(int new_data){
            Node tmpNode = new Node(new_data);
            tmpNode.next = head;
            head = tmpNode;
        }

        public void print(){
            Node tmpNode = head;
            if (tmpNode == null) {
                System.out.println("LinkedList is Empty");
                return;
            }

            while (tmpNode != null) {
                System.out.println(tmpNode.data+" ");
                head = tmpNode.next;
            }
        }
    }
    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.push(10);
        mll.push(20);
        mll.push(30);
        mll.print();
    }
}