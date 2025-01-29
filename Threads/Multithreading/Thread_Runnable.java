package Threads.Multithreading;


class MyThreadDemo3  implements Runnable{
    //Below Instruction will pass also this type
    MyThreadDemo3(){
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
    }
    
}

public class Thread_Runnable{
    public static void main(String[] args) {
        MyThreadDemo3 th3 = new MyThreadDemo3();
        // th3.start(); // Throws error because start method does not belong to current class(MyThreadDemo3).

        //So we execute the thread class by using Thread class constructor. 
        // Thread th = new Thread(th3); //In this Construtor we pass a runnable object (We pass the Runnable child class Object).
        // th.start();
    }  
}