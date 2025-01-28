package Threads.Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
        Thread current_th = Thread.currentThread();
        String thName  = current_th.getName();
       /* MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        th1.start();
        th2.start(); */

        // Sleep Method
        for(int i=1; i<=5; i++){
            System.out.println(i + " <-> " + thName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread{

    public void run(){
        Thread cThread = Thread.currentThread();
        String cName = cThread.getName();

        for(int i=1; i<= 5; i++){
            System.out.println(i+" <-> "+ cName);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    /*O/P
    1 <-> Thread-0
    1 <-> main
    2 <-> Thread-0
    2 <-> main
    3 <-> Thread-0
    4 <-> Thread-0
    3 <-> main
    5 <-> Thread-0
    4 <-> main
    5 <-> main */

    /*int c;
    c=10/0; */

    /*Thread
    public void run(){
        System.out.println("Hello This is my Thread "+ getState());
    } */

    /*MultiThread
    public void run(){
        for(int i=1; i<=10;i++){
            System.out.println(i + " -> "+ getName() +" ->  "+ getPriority());
        }
    } */
}


/*o/p
1 -> Thread-2 ->  5
1 -> Thread-1 ->  5
2 -> Thread-2 ->  5
2 -> Thread-1 ->  5
3 -> Thread-2 ->  5
4 -> Thread-2 ->  5
3 -> Thread-1 ->  5
5 -> Thread-2 ->  5
4 -> Thread-1 ->  5
6 -> Thread-2 ->  5
5 -> Thread-1 ->  5
7 -> Thread-2 ->  5
6 -> Thread-1 ->  5
8 -> Thread-2 ->  5
7 -> Thread-1 ->  5
9 -> Thread-2 ->  5
8 -> Thread-1 ->  5
10 -> Thread-2 ->  5
9 -> Thread-1 ->  5
10 -> Thread-1 ->  5 */