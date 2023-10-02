package Opps.Polymorphism.MethodOverriding;

class Parent{
    void show(){
        System.out.println("I am the parent class");
    }
}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("I am Child class and overrid the show() method from Parent Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();

        Parent obj2 = new Child();
        obj2.show();
    }
}
