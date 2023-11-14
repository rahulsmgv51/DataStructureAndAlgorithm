package Threads;

// Thread using implementation of Runnable interface
class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread A" + i);
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread B" + i);
        }
    }
}

class C implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread C" + i);
        }
    }
}

public class Threads_By_RunnableInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A()); // Create thread class obj and pass the our class object which implement the
                                         // runnable interface
        Thread t2 = new Thread(new B());
        Thread t3 = new Thread(new C());
        // All threads are independent
        t1.start();
        t2.start();
        t3.start();
    }
}