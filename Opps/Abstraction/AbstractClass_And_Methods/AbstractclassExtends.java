package Opps.Abstraction.AbstractClass_And_Methods;

abstract class Person{
    abstract void showName();
}
abstract class Student extends Person{
    //If child class extend the abstract super class and not define method/not implemented abstract super class method
    // -- then this class also declared as abstract class
}
public class AbstractclassExtends {
    public static void main(String[] args) {
        // And We can not create its object
    }
}
