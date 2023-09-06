package Opps.Overloading_and_Overriding;

class P {
    // f1() method is overloading in its child class C
    public void f1(int x){
        System.out.println("Class Parent");
    }

    public void f2(int x){
        System.out.println("Method f2 Overridden in class C");
    }
}
class C extends P{
    // Method Overloading
    public void f1(int x, int y){
        System.out.println("Class Child");
    }

    // Method Overriding 
    @Override
    public void f2(int x){
        System.out.println("Method f2 is Overrding from Class P");
    }
}
public class Main{
    public static void main(String[] args) {
        C obj = new C();
        obj.f1(0, 0);
        obj.f1(0);
        obj.f2(0);
    }
}
