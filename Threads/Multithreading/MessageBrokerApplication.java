package Threads.Multithreading;

class SharedData{
    //Store data by producer thread and data will consumed by consumer thread
    private int data;

    // Semaphore Variable
    private boolean writable = true;

    public synchronized void produceData(int x){
        if (writable == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = x;
        System.out.println("Produced : "+x);
        writable = false;
        notify();
    }

    // Data consumed consumer thread
    public synchronized int consume(){
        if (writable == true) {
            try {
                wait();
              
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        writable = true;
        notify();
        return data;
    }
}


//Achive Synchronization by calling same thread so Producer and Consumer both are use same object for calling method (SharedData).
class Producer extends Thread{
    SharedData d;
    public Producer(SharedData d){
        this.d = d;
    }

    public void run(){
        for(int i=1; i<=10; i++){
            d.produceData(i);
            try {
                sleep(300);
            } catch (InterruptedException e) {
               System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread{
    SharedData d;
    public Consumer(SharedData d){
        this.d = d;
    }

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Consumed value is : "+ d.consume());
            try {
                sleep(300);
            } catch (InterruptedException e) {
               System.out.println(e);
            }
        }
    }
}

public class MessageBrokerApplication {
    public static void main(String[] args) {
        SharedData d = new SharedData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}