package Opps.Inheritance.InheritanceExample;

public class Car extends Vehicle{
    //method overriding
    // void start(){
    //     System.out.println(this);
    //     System.out.println(this.model+" Car is Starting");
    // }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.model = "nexon";
        obj.start();
    }
}