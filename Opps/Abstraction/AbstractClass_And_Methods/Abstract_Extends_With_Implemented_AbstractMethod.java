package Opps.Abstraction.AbstractClass_And_Methods;
abstract class Person{
    abstract void showName();
}
class Students extends Person{

    @Override
    void showName() {
       System.out.println("Call from Abstract Method");
    }
    
}
public class Abstract_Extends_With_Implemented_AbstractMethod {
    public static void main(String[] args) {
        Students obj = new Students();
        obj.showName();
    }
}
