package Queue;

public class Queue_UsingLinkedList {
    class QueueNode {
        int data;
        QueueNode next;

        public QueueNode(int data) {
            this.data = data;
            next = null;
        }
    }

    QueueNode front;
    QueueNode rear;

    void push(int data) {
        QueueNode newNode = new QueueNode(data);
        if (front == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int pop() {
        if (front == null) {
            return -1;
        }
        int temp = front.data;
        front = front.next;
        return temp;
    }

    void printLL() {
        while (front != null) {
            System.out.print(front.data + " ");
            front = front.next;
        }
    }

    public static void main(String[] args) {
        Queue_UsingLinkedList q = new Queue_UsingLinkedList();
        q.push(10);
        q.pop();
        q.push(20);
        q.pop();
        q.push(30);
        q.pop();
        q.push(40);
        q.printLL();
    }

}