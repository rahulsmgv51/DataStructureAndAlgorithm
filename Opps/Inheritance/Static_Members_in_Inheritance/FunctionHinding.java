package Opps.Inheritance.Static_Members_in_Inheritance;
class Parent{
    static int y = 4;
    public static void f1(){
        System.out.println("Hello");
    }
}
class Child extends Parent{
    static{
        y = 5;
    }
    public static void f1(){
        System.out.println("Hello world");
    }
}
public class FunctionHinding {
    public static void main(String[] args) {
        System.out.println("Value of Y "+Child.y); // y = 4 In there call parent class Y value, when program call then Internally change child to parent 
        Child.f1(); // Only call child class method and Parent class method are hide
    }
}
