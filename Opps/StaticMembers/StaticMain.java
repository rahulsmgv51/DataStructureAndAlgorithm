package Opps.StaticMembers;

class Main{
    int x; //Instance variable
    static int y; //static member Variable

    public void fun1(){ //instance member function
        System.out.println("Hello, I am Instance Member Function");
    }

    public static void fun2(){ // static member function
        y = 6; // We only change static member variable value in static method
        System.out.println(y+"  Hello, I am Static member Function");
    }
    static class StaticInnerClass{
        public static String Name = "RAHUL";
    }
}
public class StaticMain{
    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main();
        Main.y = 5; //Static member variable create only one time in a class and also for every object but instance member variable create every time when create new object.
        obj1.x = 4;
        obj2.x = 3;
        Main.fun2();
        Main.StaticInnerClass.Name = "R K V";
        System.out.println(Main.StaticInnerClass.Name + "  "+ Main.y);
    }
}