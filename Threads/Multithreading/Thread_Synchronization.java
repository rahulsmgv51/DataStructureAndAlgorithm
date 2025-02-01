package Threads.Multithreading;

class Thread_PrintTable1 extends Thread{
    TablePrint tp;
    public Thread_PrintTable1(TablePrint tp){
        this.tp = tp;
    }
    public void run(){
        tp.display(5);
    }
}

class Thread_PrintTable2 extends Thread{
    TablePrint tp;
    public Thread_PrintTable2(TablePrint tp){
        this.tp = tp;
    }
    public void run(){
        tp.display(6);
    }
}

class TablePrint{
    synchronized void display(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+" * "+i +" = "+n*i);
        }
    }
}

public class Thread_Synchronization {
    public static void main(String[] args) {
        TablePrint table = new TablePrint();
        
        Thread_PrintTable1 th1 = new Thread_PrintTable1(table);
        Thread_PrintTable2 th2 = new Thread_PrintTable2(table);
        th1.start();
        th2.start();
    }
}