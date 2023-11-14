package Threads;

class A1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread A" + i);
        }
    }
}

class B1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread B" + i);
        }
    } 
}

public class Threads_By_ThreadClass {
    public static void main(String[] args) {
        A1 objA = new A1();
        B1 objB = new B1();

        objA.start();
        objB.start();
    }
}
