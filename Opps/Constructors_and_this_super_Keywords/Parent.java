package Opps.Constructors_and_this_super_Keywords;

class Parent {
      String s = "Parent Variable"; 
}
class Child extends Parent{
    String s = "Child Variable";

    public void m1(){
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
class Test1{
    public static void main(String[] args) {
        Child child = new Child();
        child.m1();
    }
}
