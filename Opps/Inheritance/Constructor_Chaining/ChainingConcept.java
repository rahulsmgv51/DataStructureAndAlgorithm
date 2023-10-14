package Opps.Inheritance.Constructor_Chaining;

class A{
    public A(){
        System.out.println("A 1");
    }
}
class B extends A{
    public B(){
        // By defualt write a line of code here
        // super();
        this(3); // this represent same class constructor
        System.out.println("B 1");
    }
    public B(int x){
        System.out.println("B 2");
    }
}

public class ChainingConcept {
    public static void main(String[] args) {
        B obj = new B(); //A 1, B2,  B 1
    }    
}
