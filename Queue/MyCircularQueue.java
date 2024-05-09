package Queue;

public class MyCircularQueue {
    int size;
    int a[];
    int front, rear;

    public MyCircularQueue(int size) {
        this.size = size;
        a = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        if (rear == size - 1 && front == 0)
            return true;
        if (rear + 1 == front)
            return true;

        return false;
    }

    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }

        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
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
        front = (front + 1) % size;
        return temp;
    }

    public void printQueue() {
        if (isEmpty())
            return;

        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.println(a[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.println(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(6);
        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        queue.enqueue(44);
        queue.enqueue(55);
        queue.enqueue(66);
        queue.enqueue(77);
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(88);
        queue.enqueue(99);
        
        queue.printQueue();
    }
}