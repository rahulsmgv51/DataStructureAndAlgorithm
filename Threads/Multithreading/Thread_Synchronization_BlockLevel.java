package Threads.Multithreading;

class Thread_PrintTable3 extends Thread{
    public void run(){
        TablePrintln.display(8);
    }
}

class Thread_PrintTable4 extends Thread{
    public void run(){
        TablePrintln.display(9);
    }
}

class TablePrintln{

    //When we call static method by class name, then it acquire lock over the class instead of object.
    public synchronized static void display(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+" * "+i +" = "+n*i);
        }   
    }
   //When we use synchronized in static block then we need to pass as object current .class name in arg. of synchronized
    /* public static void display(int n){
        synchronized(TablePrintln.class){
            for(int i=1; i<=10; i++){
                System.out.println(n+" * "+i +" = "+n*i);
            } 
        }  
    } */

    /* void display(int n){
        //Pass the current class object in the synchronized block
        synchronized (this){
            for(int i=1; i<=10; i++){
                System.out.println(n+" * "+i +" = "+n*i);
            }
        }
    } */
}

public class Thread_Synchronization_BlockLevel {
    public static void main(String[] args) {
        Thread_PrintTable3 th1 = new Thread_PrintTable3();
        Thread_PrintTable4 th2 = new Thread_PrintTable4();
        th1.start();
        th2.start();
    }
}
