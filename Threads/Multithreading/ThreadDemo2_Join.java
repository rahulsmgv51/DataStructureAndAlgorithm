package Threads.Multithreading;

class MyThread2 extends Thread{
    public void run(){
        try {
            // Deadlock senario
            this.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for(int i=1; i<=5; i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
// The Thread.join() method in Java is a powerful tool for managing concurrency and ensuring that one thread waits 
// for the completion of another thread before proceeding. This method is particularly useful in scenarios where the 
// execution of one thread depends on the result or completion of another thread.
public class ThreadDemo2_Join {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 th1 = new MyThread2();
        th1.start();
        th1.join();

        for(int i=1; i<=5; i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
        
    }
}


/* 
o/p
1 Thread-0
2 Thread-0
3 Thread-0
4 Thread-0
5 Thread-0
1 main
2 main
3 main
4 main
5 main
*/