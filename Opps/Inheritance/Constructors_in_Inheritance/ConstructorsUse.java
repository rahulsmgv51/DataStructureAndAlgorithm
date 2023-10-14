package Opps.Inheritance.Constructors_in_Inheritance;

class A{
    int a;
    public A(){
        System.out.println("Parent Class Constructor");
    }
    public A(int x){
        a = x;
        System.out.println("Parent class constructor call when use super keyword and pass args");
    }
}
class B extends A{
    int b;
    public B(){
        // super(); // if we are write super() then compile will not create -
        // if we are not write then compiler will create by default parent class constructor , 
        // but these only applicable on no args constructor then we need to pass args in super(3)
        super(3);
        System.out.println("Child Class Constructor");
    }
}
public class ConstructorsUse {
    public static void main(String[] args) {
        B obj = new B(); // When create object in inheritance then assign memory for both class, above assigned memory for both a and b;
        // Sub class's constructor invokes constructor of super class, and  before running child class constructor by default call parent class constructor
    }
}
