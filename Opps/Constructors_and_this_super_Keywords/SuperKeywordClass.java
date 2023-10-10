package Opps.Constructors_and_this_super_Keywords;

class A {
    int x;
    int y;

    public void f1() {
        System.out.println("Hello I am super Keyword");
    }
}

class B extends A {
    int y;

    public void f1() {
        super.f1();
        System.out.println("Hello I am child");
    }

    public void f2() {
        int z;
        z = 2;
        this.y = 3;
        super.x = 7;
        super.y = 10;
        System.out.println("value of x "+ x +", y "+ y +"and z "+ z +" super class y value "+ super.y);
    }
}

public class SuperKeywordClass {
    public static void main(String[] args) {
        A obj = new A(); // By using this object we can call only super class A method
        obj.f1();

        A obj1 = new B(); // By using this we can call class A and B method
        B obj2 = new B(); // Both are same

        obj2.f2();

        // B obj3 = new A(); Complie time error
    }
}