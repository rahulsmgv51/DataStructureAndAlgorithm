package Queue.QueueBasicImpl;

public class QueueUsingArray {
    public static void main(String[] args){
        MyQueue queue = new MyQueue(5);
        queue.enqueue(3);queue.enqueue(5);queue.enqueue(6);queue.enqueue(8);queue.enqueue(4);
        queue.printQueue();
        queue.enqueue(2);
        System.out.println("Queue Peek Element "+queue.peek());
        System.out.println("Dequeue: "+queue.dequeue());System.out.println("Dequeue: "+queue.dequeue());System.out.println("Dequeue: "+queue.dequeue());
        queue.printQueue();
        System.out.println("Dequeue: "+queue.dequeue());
        System.out.println("Dequeue: "+queue.dequeue());
        System.out.println("Dequeue: "+queue.dequeue());
        queue.enqueue(43);
        queue.printQueue();

    }
}

class MyQueue{
    private int front;
    private int rear;
    private int size;
    private int arr[];

    public MyQueue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        return rear == size-1;
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean enqueue(int data){
        if(isFull()){
            System.out.println("Queue size is fulled !!");
            return false;
        }
        if(isEmpty()){
            front = 0;
        }
        rear++;
        arr[rear] = data;
        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty !!");
            return -1;
        }
        int tmp = arr[front];
        if(front == rear){
            front = rear = -1;
            return tmp;
        }
        front++;
        return tmp;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty !!");
            return -1;
        }
        return arr[front];
    }

    public void printQueue(){
        if(isEmpty()) return;
        for(int i=front; i<=rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}