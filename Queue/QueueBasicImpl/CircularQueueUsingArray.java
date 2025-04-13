package Queue.QueueBasicImpl;

public class CircularQueueUsingArray{

    public static void main(String[] args){
        MyCircularQueueUsingArray cQueue = new MyCircularQueueUsingArray(5);
        cQueue.enqueue(4);cQueue.enqueue(2);cQueue.enqueue(9);cQueue.enqueue(1);cQueue.enqueue(8);
        cQueue.printQueue();
        cQueue.enqueue(32);
        System.out.println(cQueue.dequeue());
        cQueue.enqueue(32);
        cQueue.printQueue();
        System.out.println(cQueue.peek());
    }
}

class MyCircularQueueUsingArray {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public MyCircularQueueUsingArray(int size){
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty(){
       return front == -1;
    }

    public boolean isFull(){
        if(rear == size-1 && front == 0) return true;
        if(rear+1 == front) return true;
        return false; 
    }

    public boolean enqueue(int data){
        if(isFull()){
            System.out.println("Queue size is fulled !!");
            return false;
        }

        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;

        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty !!");
            return -1;
        }
        int temp = arr[rear];
        if(front == rear){
            front = rear = -1;
            return temp;
        }
        front = (front+1)%size;
        return temp;
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

        if(rear >= front){
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
        }
        if(front > rear){
            for(int i=front; i<size; i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0; i<= rear; i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}