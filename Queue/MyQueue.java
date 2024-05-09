package Queue;

public class MyQueue {
    int size;
    private int a[];
    private int front;
    private int rear;

    public MyQueue(int size) {
        this.size = size;
        a = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }

        if (isEmpty()) {
            front = 0;
        }
        rear++;
        a[rear] = data;

        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int temp = a[front];
        if (front == rear) {
            front = rear = -1;
            return temp;
        }
        front++;
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return a[front];
    }

    public void printQueue() {
        if (isEmpty()) {
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(100005);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        queue.dequeue();
        queue.printQueue();

        // queue.enqueue(11);
        // queue.enqueue(22);
        // queue.enqueue(33);
        // queue.enqueue(44);

        // queue.printQueue();

        // queue.enqueue(55);
        // System.out.println(queue.dequeue());
        // System.out.println(queue.peek());
        // queue.dequeue();
        // queue.dequeue();
        // queue.dequeue();
        // queue.dequeue();
        // queue.peek();
    }
}