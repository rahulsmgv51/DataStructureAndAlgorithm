package Opps.Polymorphism;

public class MainClass {
    public static void main(String[] args) {
        // Run Time Polymorphism
        // Dog d = new Dog();

        // Pet p = d;
        // Animal a = d;

        // d.walk();
        // p.walk();

        // Compile Time Polymorphism
        greetings("Ravi");
        
    }

    public static void greetings(){
        System.out.println("Hii, There");
    }

    public static void greetings(String s){
        System.out.println("Hii, There  "+s);
    }
}
